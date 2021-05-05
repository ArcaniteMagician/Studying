package cn.arcanite.java.pattern.singleton;

/**
 * 饿汉模式（非线程安全）
 * 保证一个类仅有一个实例，提供一个访问它的全局访问点。
 */
public class Singleton1 {
    // 静态常量全大写命名
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
        System.out.println("1, init");
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    public void introduce() {
        System.out.println("饿汉模式，" + INSTANCE.hashCode());
        System.out.println("在类加载的时候就完成实例化，如果从始至终未使用这个实例，则会造成内存的浪费。");
    }
}
