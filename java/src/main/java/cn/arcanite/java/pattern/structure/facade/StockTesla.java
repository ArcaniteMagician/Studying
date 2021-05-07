package cn.arcanite.java.pattern.structure.facade;

/**
 * 子系统2
 *
 * @author Jim
 * @date 2021/05/07
 */
public class StockTesla implements Trade {

    protected StockTesla() {
        // 声明为protected，则对包外非子类不可见
    }

    @Override
    public boolean buy() {
        System.out.println("买入特斯拉股票");
        return true;
    }

    @Override
    public boolean sell() {
        System.out.println("出售特斯拉股票");
        return true;
    }
}
