package cn.arcanite.java.pattern.structure.proxy.statics;

/**
 * @author Jim
 * @date 2021/05/05
 */
public class Cinema implements Movie {

    private final RealMovie movie;

    public Cinema(String name) {
        System.out.println("---静态代理---");
        this.movie = new RealMovie(name);
    }

    @Override
    public void play() {
        System.out.println("广告时间！");
        movie.play();
        System.out.println("感谢收看！");
    }
}
