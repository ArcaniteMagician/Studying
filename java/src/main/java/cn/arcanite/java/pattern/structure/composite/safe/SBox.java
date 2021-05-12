package cn.arcanite.java.pattern.structure.composite.safe;

import java.util.ArrayList;

/**
 * 树枝构件（Composite）角色 / 中间构件
 * 组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。主要作用是存储和管理子部件，通常包含 add()、remove()、getChild() 等方法。
 *
 * @author Jim
 * @date 2021/05/12
 */
public class SBox implements SSomething {
    private ArrayList<SSomething> children;

    public SBox() {
        this.children = new ArrayList<>();
    }

    public void add(SSomething sth) {
        children.add(sth);
    }

    public void remove(SSomething sth) {
        children.remove(sth);
    }

    public SSomething getChild(int index) {
        return index < children.size() ? children.get(index) : null;
    }

    @Override
    public void takeOut() {
        for (SSomething child : children) {
            // 如果该对象不是根节点，则访问根节点对象的同名方法时，相当于访问该对象的子节点的该同名方法
            child.takeOut();
        }
    }
}
