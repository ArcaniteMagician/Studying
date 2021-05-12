package cn.arcanite.java.pattern.structure.composite.safe;

/**
 * 抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。
 * 在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。
 *
 * @author Jim
 * @date 2021/05/12
 */
public interface SSomething {
    void takeOut();
}
