package cn.arcanite.java.pattern.structure.proxy.statics;

/**
 * @author Jim
 * @date 2021/05/05
 */
public class RealMovie implements Movie {

    private final String name;

    public RealMovie(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("正在播放电影，《" + name + "》。");
    }
}
