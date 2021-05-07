package cn.arcanite.java.pattern.structure.facade;

/**
 * 子系统1
 *
 * @author Jim
 * @date 2021/05/07
 */
public class StockApple implements Trade {

    protected StockApple() {
        // 声明为protected，则对包外非子类不可见
    }

    @Override
    public boolean buy() {
        System.out.println("买入苹果股票");
        return true;
    }

    @Override
    public boolean sell() {
        System.out.println("出售苹果股票");
        return true;
    }
}
