package cn.arcanite.java.pattern.structure.adapter;

/**
 * 适配者（Adaptee）类
 *
 * @author Jim
 * @date 2021/05/09
 */
public class Projector {
    private final String name;

    public Projector(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("使用" + name + "播放画面");
    }
}
