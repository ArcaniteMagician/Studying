package cn.arcanite.java.pattern.structure.decorator;

/**
 * @author Jim
 * @date 2021/05/06
 */
public class ThanksDecorator extends MovieDecorator {

    public ThanksDecorator(Movie movie) {
        super(movie);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("感谢收看！");
    }
}
