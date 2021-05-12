package cn.arcanite.java.pattern.structure.composite.transparent;

import java.util.ArrayList;

/**
 * 树枝构件（Composite）角色 / 中间构件
 * 组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。主要作用是存储和管理子部件，通常包含 add()、remove()、getChild() 等方法。
 *
 * @author Jim
 * @date 2021/05/12
 */
public class TBox implements TSomething {
    private ArrayList<TSomething> children;

    public TBox() {
        this.children = new ArrayList<>();
    }

    @Override
    public void add(TSomething sth) {
        children.add(sth);
    }

    @Override
    public void remove(TSomething sth) {
        children.remove(sth);
    }

    @Override
    public TSomething getChild(int index) {
        return index < children.size() ? children.get(index) : null;
    }

    @Override
    public void takeOut() {
        for (TSomething child : children) {
            // 如果该对象不是根节点，则访问根节点对象的同名方法时，相当于访问该对象的子节点的该同名方法
            child.takeOut();
        }
    }
}
