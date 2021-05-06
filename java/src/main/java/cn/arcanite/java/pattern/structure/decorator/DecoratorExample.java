package cn.arcanite.java.pattern.structure.decorator;

/**
 * 装饰者模式
 * 定义：动态地给一个对象添加一些额外的功能
 * 作用：用于在不改变原有对象类的前提下（开闭原则），一次次地增强目标对象的功能
 * 构成：抽象构件角色、具体构件角色、抽象装饰角色、具体装饰角色
 *
 * 与静态代理模式的不同：
 * 两者目标不同，代理模式关注的是对目标对象的保护，装饰者模式关注的是目标对象功能的增强。
 * 一般不会对目标进行重重代理，但经常可能会对目标对象进行层层装饰。代理模式下用户操作的是代理对象，装饰者模式下用户操作的仍是目标对象。
 * 代理模式下目标对象类没有实现接口，代理仍然可以进行，装饰者模式下却不太好进行。
 *
 * @author Jim
 * @date 2021/05/06
 */
public class DecoratorExample {

    public static void test() {
        Movie movie = new RealMovie();

        // 想要在影片前插播广告
        movie = new AdDecorator(movie);

        // 想要在影片结尾添加致谢
        movie = new ThanksDecorator(movie);

        // 开始播放
        movie.play();
    }
}
