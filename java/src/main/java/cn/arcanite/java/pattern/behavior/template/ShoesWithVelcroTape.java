package cn.arcanite.java.pattern.behavior.template;

/**
 * @author Jim
 * @date 2021/05/14
 */
public class ShoesWithVelcroTape extends Shoes {
    @Override
    public void close() {
        System.out.println("粘好魔术贴");
    }
}
