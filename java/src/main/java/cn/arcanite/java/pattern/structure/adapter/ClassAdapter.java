package cn.arcanite.java.pattern.structure.adapter;

/**
 * 类适配器类
 * 这种方式下适配器要继承适配者类，需要了解的适配者内部结构变多，耦合程度变高，所以用得少
 *
 * @author Jim
 * @date 2021/05/09
 */
public class ClassAdapter extends Projector implements Monitor {


    public ClassAdapter(String name) {
        super(name);
    }

    @Override
    public void show() {
        display();
    }
}
