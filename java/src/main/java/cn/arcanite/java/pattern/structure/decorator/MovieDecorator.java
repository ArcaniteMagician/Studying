package cn.arcanite.java.pattern.structure.decorator;

/**
 * 装饰角色
 *
 * @author Jim
 * @date 2021/05/06
 */
public abstract class MovieDecorator implements Movie {
    private final Movie movie;

    public MovieDecorator(Movie movie) {
        // 这里与静态代理模式不同，构造函数的参数为具体的对象，装饰者模式侧重于对具体对象的功能进行扩展，而不关心对具体对象的保护
        this.movie = movie;
    }

    @Override
    public void play() {
        movie.play();
    }
}
