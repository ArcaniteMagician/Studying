package cn.arcanite.java.pattern.behavior.template;

/**
 * 模板方法（Template Method）模式
 * 定义：这个比较简单，就是定义一个抽象类，子类实现特殊方法，公共方法定义在父类中
 *
 * @author Jim
 * @date 2021/05/14
 */
public abstract class Shoes {

    public void putOn() {
        stretch();
        close();
        ok();
    }

    public abstract void close();

    public void stretch() {
        System.out.println("把脚伸进鞋子里");
    }

    public void ok() {
        System.out.println("穿好了");
    }
}
