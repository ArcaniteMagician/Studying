package cn.arcanite.java.pattern.structure.adapter;

/**
 * 对象适配器类
 *
 * @author Jim
 * @date 2021/05/09
 */
public class ObjectAdapter implements Monitor {
    private Projector projector;

    public ObjectAdapter(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void show() {
        this.projector.display();
    }
}
