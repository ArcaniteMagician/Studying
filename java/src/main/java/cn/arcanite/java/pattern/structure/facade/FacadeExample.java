package cn.arcanite.java.pattern.structure.facade;

/**
 * 外观模式
 * 定义：将若干个子系统的复杂流程，统一交给一个类提供给用户，用户使用相关对象时可以简化操作流程，同时子系统被保护
 *
 * @author Jim
 * @date 2021/05/07
 */
public class FacadeExample {

    public static void test() {
        // 注：基金流程仅供参考，买卖以实际为准
        Fund fund = new Fund();
        fund.buy();
        fund.sell();
    }
}
