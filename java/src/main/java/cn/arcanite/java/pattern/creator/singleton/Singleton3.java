package cn.arcanite.java.pattern.creator.singleton;

/**
 * 双重检查模式（DCL，线程安全）
 * 保证一个类仅有一个实例，提供一个访问它的全局访问点。
 *
 * @author Jim
 * @date 2021/05/04
 */
public class Singleton3 {
    // 注：这里的volatile和“=null”非常关键，在JDK1.5之后，可以保证instance对象每次都是从主内存中读取
    // 主内存、工作内存：每个线程都有自己的工作内存，变量的修改操作只能在工作内存中进行，共享变量虽然存储于主内存中，但是修改时需要先拷贝到工作内存，修改之后再同步回主内存
    // 使用了volatile关键字保证实例的可见性
    // 1.保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。（实现可见性）
    // 2.禁止进行指令重排序。（实现有序性）
    // 3.volatile 只能保证对单次读/写的原子性。i++ 这种操作不能保证原子性。
    private static volatile Singleton3 instance = null;

    private Singleton3() {
        System.out.println("3, init");
    }

    public static Singleton3 getInstance() {// 这里可以传参用于初始化，这是双重检查方式比静态内部类方式要灵活的一点
        if (instance == null) {
            // 第一次判空，省去了不必要的同步操作
            synchronized(Singleton3.class) {
                if (instance == null) {
                    // 第二次是在instance为空时才创建实例，防止不同线程都在第一次检查时为空，进入了同步代码块

                    // DCL在一定程度上解决了资源的消耗、多余的同步、线程安全问题。
                    // 但instance = new Singleton()语句，看起来只有一行代码，但实际上它并不是原子操作
                    // 1）给instance的实例分配内存.。
                    // 2）调用Singleton()构造函数，初始化成员字段。
                    // 3）将instance对象指向分配的内存空间（此时instance就不是null了）。
                    // 编译器为了提高性能，可能会对指令进行重排序，于是执行顺序可能是1-2-3，也可能是1-3-2（volatile关键字可以保证有序性）
                    // 高并发的情况下，线程A中执行1-3，切换到线程B的第一次判空，会判断instance非空并直接返回，此时instance并未实例化，B会报空指针异常，这就是DCL的失效。
                    instance = new Singleton3();
                    // synchronized用于修饰方法或代码块，性能较差
                    // volatile用于修饰变量，但无法保证原子性，简单的赋值操作本身具有原子性，所以对于共享变量的纯赋值操作，可以直接使用volatile来实现线程安全且效率高一些，这里不是纯赋值操作，所以不能这么做。
                }
            }
        }
        return instance;
    }

    public void introduce() {
        System.out.println("双重检查模式，" + instance.hashCode());
        System.out.println("资源利用率高，第一次执行getInstance时单例对象才会被实例化，可以传参");
        System.out.println("第一次加载稍慢，也由于JMM的原因导致偶尔会失败。volatile或多或少也会影响到性能，但考虑到程序的正确性，这点牺牲也是值得的。");
    }

    private Object readResolve(){
        // 这是枚举以外的单例模式，防止序列化/反序列化时发生变更的方法，具体与反序列化时的readObject方法的具体实现有关
        System.out.println("read resolve");
        return instance;
    }
}
