package cn.arcanite.java.pattern.structure.adapter;

/**
 * 适配器模式
 * 定义：将一个类通过另一个类转换成客户希望的另外一个接口，使得原本由于与这个类接口不兼容而不能一起工作的那些类能一起工作
 * 场景：两个对象因接口不兼容而不能在一起工作的实例，这时就可以用第三者进行适配
 *
 * @author Jim
 * @date 2021/05/09
 */
public class AdapterExample {

    public static void test() {
        Computer computer = new Computer();
        Monitor monitor1 = new ClassAdapter("1号投影仪");
        computer.setMonitor(monitor1);
        computer.show();

        Projector projector = new Projector("2号投影仪");
        Monitor monitor2 = new ObjectAdapter(projector);
        computer.setMonitor(monitor2);
        computer.show();
    }
}
