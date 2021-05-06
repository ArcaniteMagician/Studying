package cn.arcanite.java.pattern.structure.decorator;

/**
 * @author Jim
 * @date 2021/05/06
 */
public class AdDecorator extends MovieDecorator {

    public AdDecorator(Movie movie) {
        super(movie);
    }

    @Override
    public void play() {
        System.out.println("广告时间！");
        super.play();
    }
}
