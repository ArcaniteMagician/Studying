package cn.arcanite.java.pattern.structure.decorator;

/**
 * 具体构件角色
 *
 * @author Jim
 * @date 2021/05/06
 */
public class RealMovie implements Movie {
    @Override
    public void play() {
        System.out.println("正在播放电影。。。");
    }
}
