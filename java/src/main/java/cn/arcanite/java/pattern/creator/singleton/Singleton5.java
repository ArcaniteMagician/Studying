package cn.arcanite.java.pattern.creator.singleton;

/**
 * 枚举模式（线程安全）
 *
 * @author Jim
 * @date 2021/05/04
 */
public enum Singleton5 {
    INSTANCE;

    public void introduce() {
        System.out.println("枚举模式，" + Singleton5.INSTANCE.hashCode());
        System.out.println("写法简单，默认枚举实例的创建是线程安全的，并且在任何情况下（包括序列化/反序列化、反射）都是单例");
        System.out.println("另外几种单例模式创建的单例对象被反序列化时会重新创建实例，可以重写readResolve方法返回当前的单例对象");
        System.out.println("可读性不高");
    }
}
