package cn.arcanite.java.pattern.structure.composite.safe;

/**
 * 树叶构件（Leaf）角色
 * 组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件。
 *
 * @author Jim
 * @date 2021/05/12
 */
public class SBook implements SSomething {
    private String name;

    public SBook(String name) {
        this.name = name;
    }

    @Override
    public void takeOut() {
        System.out.println(name + "被取出");
    }
}
