package cn.arcanite.java.pattern.structure.proxy.dynamic;

import cn.arcanite.java.pattern.structure.proxy.statics.Movie;

/**
 * @author Jim
 * @date 2021/05/05
 */
public class CartonMovie implements Movie, Carton {
    private String name;

    public CartonMovie(String name) {
        this.name = name;
    }

    @Override
    public void test() {
        System.out.println("Test");
    }

    @Override
    public void play() {
        System.out.println("正在播放电影，《" + name + "》。");
    }
}
