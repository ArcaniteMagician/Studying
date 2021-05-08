package cn.arcanite.java.pattern.structure.adapter;

/**
 * 当前业务系统，这并不是适配器模式中声明的结构之一，但却是起因
 *
 * @author Jim
 * @date 2021/05/09
 */
public class Computer {
    private Monitor monitor;

    public Computer() {
        System.out.println("新建电脑对象");
    }

    public void setMonitor(Monitor monitor) {
        System.out.println("设置电脑的显示器");
        this.monitor = monitor;
    }

    public void show() {
        System.out.println("电脑希望“显示器”播放画面");
        monitor.show();
    }
}
