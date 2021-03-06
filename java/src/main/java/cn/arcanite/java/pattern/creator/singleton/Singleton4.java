package cn.arcanite.java.pattern.creator.singleton;

/**
 * 静态内部类模式（线程安全）
 * 保证一个类仅有一个实例对象，同时会提供一个全局访问的方法
 *
 * @author Jim
 * @date 2021/05/04
 */
public class Singleton4 {

    private Singleton4() {
        System.out.println("4, init");
    }

    public static Singleton4 getInstance() {
        return Holder.INSTANCE;
    }

    public void introduce() {
        System.out.println("静态内部类模式，" + Holder.INSTANCE.hashCode());
        System.out.println("不用synchronized，效率高。延迟加载，资源利用率高。写法简单");
        System.out.println("无法传参");
    }

    private static class Holder {
        // 只有在第一次调用getInstance()方法时虚拟机才会加载Holder类，并初始化INSTANCE
        public static final Singleton4 INSTANCE = new Singleton4();
    }
}
