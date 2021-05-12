package cn.arcanite.java.pattern.structure.composite.transparent;

/**
 * 树叶构件（Leaf）角色
 * 组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件。
 *
 * @author Jim
 * @date 2021/05/12
 */
public class TBook implements TSomething {
    private String name;

    public TBook(String name) {
        this.name = name;
    }

    @Override
    public void takeOut() {
        System.out.println(name + "被取出");
    }

    // 优点：对用户透明
    // 缺点：以下三个方法是为了对用户的透明而实现的无意义的方法，甚至第三个方法可能造成NPE
    @Override
    public void add(TSomething sth) {

    }

    @Override
    public void remove(TSomething sth) {

    }

    @Override
    public TSomething getChild(int index) {
        return null;
    }
}
