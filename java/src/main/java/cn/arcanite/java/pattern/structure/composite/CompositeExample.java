package cn.arcanite.java.pattern.structure.composite;

import cn.arcanite.java.pattern.structure.composite.safe.SBook;
import cn.arcanite.java.pattern.structure.composite.safe.SBox;
import cn.arcanite.java.pattern.structure.composite.transparent.TBook;
import cn.arcanite.java.pattern.structure.composite.transparent.TBox;
import cn.arcanite.java.pattern.structure.composite.transparent.TSomething;

/**
 * 组合（Composite Pattern）模式
 * 定义：有时又叫作整体-部分（Part-Whole）模式，它是一种将对象组合成树状的层次结构的模式，用来表示“整体-部分”的关系，使用户对单个对象和组合对象具有一致的访问性
 *
 * @author Jim
 * @date 2021/05/12
 */
public class CompositeExample {
    public static void test() {
        testTransparent();
        testSafe();
    }

    private static void testTransparent() {
        System.out.println("透明组合模式");
        // 定义时不需要声明树枝对象为具体对象类型（这种情况下其实还是以具体对象类型进行对象初始化的，所以并未完全透明）
        TSomething bigBox = new TBox();
        TSomething smallBox1 = new TBox();
        smallBox1.add(new TBook("Book1 in smallBox1"));
        smallBox1.add(new TBook("Book2 in smallBox1"));
        bigBox.add(smallBox1);
        bigBox.add(new TBook("Book3 in bigBox"));
        TSomething smallBox2 = new TBox();
        smallBox2.add(new TBook("Book1 in smallBox2"));
        bigBox.add(smallBox2);

        bigBox.takeOut();
    }

    private static void testSafe() {
        System.out.println("安全组合模式");
        // 定义时需要声明树枝对象为具体对象类型，但这种模式下叶子对象不需要平白增加树枝对象才有的各种管理方法，可以避免安全问题
        SBox bigBox = new SBox();
        SBox smallBox1 = new SBox();
        smallBox1.add(new SBook("Book1 in smallBox1"));
        smallBox1.add(new SBook("Book2 in smallBox1"));
        bigBox.add(smallBox1);
        bigBox.add(new SBook("Book3 in bigBox"));
        SBox smallBox2 = new SBox();
        smallBox2.add(new SBook("Book1 in smallBox2"));
        bigBox.add(smallBox2);

        bigBox.takeOut();
    }
}
