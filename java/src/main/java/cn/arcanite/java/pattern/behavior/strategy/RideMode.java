package cn.arcanite.java.pattern.behavior.strategy;

/**
 * 具体策略角色
 *
 * @author Jim
 * @date 2021/05/13
 */
public class RideMode implements Mode {

    @Override
    public String getName() {
        return "骑行模式";
    }

    @Override
    public String getAvoidance() {
        return "高架";
    }
}