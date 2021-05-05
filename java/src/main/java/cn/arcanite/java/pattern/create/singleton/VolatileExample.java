package cn.arcanite.java.pattern.create.singleton;

/**
 * 变量的内存可见性例子
 *
 * @author Jim
 * @date 2021/05/05
 */
public class VolatileExample {

    public static void test() {
        MyThread myThread = new MyThread("myThread");
        // 开启线程
        myThread.start();

        for (; ; ) {
            synchronized(myThread) {
                // 加锁后可保证可见性，但这种写法报警告了，不是正确写法，仅图方便做演示用
                // 因为当一个线程进入 synchronized 代码块后，线程获取到锁，会清空本地内存，然后从主内存中拷贝共享变量的最新值到本地内存作为副本，执行代码，又将修改后的副本值刷新到主内存中，最后线程释放锁。
                if (myThread.isFlag()) {
                    System.out.println("主线程synchronized访问到 flag 变量");
                    break;
                }
            }
        }

        MyThread myThread1 = new MyThread("myThread1");
        // 开启线程
        myThread1.start();

        // 主线程执行
        for (; ; ) {
            // 有趣的彩蛋：在这个循环体里加一句println()语句，就可以访问到flag的正确值了
            // 原因：println()方法的具体实现中使用了synchronized代码块，会获取到锁，清空本地内存，从主内存中拷贝共享变量的最新值到工作内存作为副本，于是就得到了最新值
            if (myThread1.isFlag()) {
                System.out.println("主线程访问到 flag 变量");
                break;
            }
        }
    }

}

/**
 * 子线程类
 */
class MyThread extends Thread {
    private final String name;

    private boolean flag = false;
    // 使用 volatile 修饰共享变量后，每个线程要操作变量时会从主内存中将变量拷贝到本地内存作为副本，当线程操作变量副本并写回主内存后，会通过 CPU 总线嗅探机制告知其他线程该变量副本已经失效，需要重新从主内存中读取。
//    private volatile boolean flag = false; // 增加volatile关键字，可以确保可见性


    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 修改变量值，此时修改的是子线程工作内存中的子线程对象（共享变量）副本中的flag值，大概，这段是我自己想的= -
        flag = true;
        System.out.println(name + ", flag = " + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
