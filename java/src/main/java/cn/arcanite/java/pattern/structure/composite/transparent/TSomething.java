package cn.arcanite.java.pattern.structure.composite.transparent;

/**
 * 抽象构件（Component）角色
 * 它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口（比如新增、删除）。
 *
 * @author Jim
 * @date 2021/05/12
 */
public interface TSomething {
    void add(TSomething sth);

    void remove(TSomething sth);

    TSomething getChild(int index);

    void takeOut();
}
