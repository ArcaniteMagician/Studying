package cn.arcanite.java.pattern.singleton;

/**
 * 懒汉模式（线程安全）
 * 保证一个类仅有一个实例，提供一个访问它的全局访问点。
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
        System.out.println("2, init");
    }

    public static synchronized Singleton2 getInstance() {
        // 加锁后能保证变量的内存可见性：
        // 因为当一个线程进入 synchronized 代码块后，线程获取到锁，会清空本地内存，然后从主内存中拷贝共享变量的最新值到本地内存作为副本，
        // 执行代码，又将修改后的副本值刷新到主内存中，最后线程释放锁。
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public void introduce() {
        System.out.println("懒汉模式，" + instance.hashCode());
        System.out.println("为了保证线程安全加入了synchronized关键字，但每次调用实例都需要进行同步，会造成不必要的开销");
    }
}
