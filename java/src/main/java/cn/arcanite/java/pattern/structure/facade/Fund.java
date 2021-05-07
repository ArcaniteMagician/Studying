package cn.arcanite.java.pattern.structure.facade;

/**
 * 外观类，其实即使子系统与外观类无法抽象出同一套接口，仍可以使用该模式，但是使用接口的方式是更符合定义的
 *
 * @author Jim
 * @date 2021/05/07
 */
public class Fund implements Trade {
    private final StockTesla tesla;
    private final StockApple apple;

    public Fund() {
        tesla = new StockTesla();
        apple = new StockApple();
    }

    @Override
    public boolean buy() {
        System.out.println("发起基金买入申请");
        tesla.buy();
        apple.buy();
        return true;
    }

    @Override
    public boolean sell() {
        System.out.println("发起基金卖出申请");
        tesla.sell();
        apple.sell();
        return true;
    }
}
