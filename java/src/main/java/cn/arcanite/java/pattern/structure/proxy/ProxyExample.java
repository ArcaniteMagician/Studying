package cn.arcanite.java.pattern.structure.proxy;

import java.lang.reflect.Proxy;

import cn.arcanite.java.pattern.structure.proxy.dynamic.Carton;
import cn.arcanite.java.pattern.structure.proxy.dynamic.CartonMovie;
import cn.arcanite.java.pattern.structure.proxy.dynamic.ProxyHandler;
import cn.arcanite.java.pattern.structure.proxy.statics.Cinema;
import cn.arcanite.java.pattern.structure.proxy.statics.Movie;
import cn.arcanite.java.pattern.structure.proxy.statics.RealMovie;

/**
 * 代理模式
 * 定义：一个类代表另一个类的功能，两者需要实现相同的接口
 * 应用场景：通过面向接口进行编码，完全将具体的实现隐藏在代理对象内部
 * @author Jim
 * @date 2021/05/05
 */
public class ProxyExample {

    public static void test() {
        // 根据代理类的创建时机和创建方式的不同，我们可以将代理分为静态代理和动态代理两种形式

        // 静态代理，代理类是事先编写、编译好的
        Cinema cinema = new Cinema("三傻大闹宝莱坞");
        cinema.play();

        // 动态代理，但是我在查阅了许多资料后，仍感觉这应该叫“动态装饰者模式”更为合适，因为这种模式下，被代理的对象对用户来说是可见的，没有隐藏在代理对象内部
        RealMovie movie = new RealMovie("三傻大闹宝莱坞");
        // 动态代理，具体的代理类是在程序运行过程中动态生成的，每个代理的实例需要关联一个InvocationHandler的实现，通过invoke方法对被代理对象的功能进行扩展
        Movie proxy = (Movie) Proxy.newProxyInstance(
                RealMovie.class.getClassLoader(), movie.getClass().getInterfaces(),
                new ProxyHandler(movie));
        proxy.play();

//        CartonMovie cartonMovie = new CartonMovie("冰雪奇缘");
        Movie proxy1 = (Movie) Proxy.newProxyInstance(
                RealMovie.class.getClassLoader(), new Class[] { Movie.class, Carton.class},// 被代理对象未实现第二个接口同样可以代理
                new ProxyHandler(movie));
        proxy1.play();

        // 强转不会报错，但是执行方法时会报错
        Carton proxy2 = (Carton) Proxy.newProxyInstance(
                RealMovie.class.getClassLoader(), new Class[] { Movie.class, Carton.class},
                new ProxyHandler(movie));
        // 执行该方法时会在invoke()方法内报错，如下：
        // java.lang.IllegalArgumentException: object is not an instance of declaring class
        proxy2.test();
    }
}
