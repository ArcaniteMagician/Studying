package cn.arcanite.java.pattern.behavior.strategy;

/**
 * 上下文角色
 * 用来操作策略使用的上下文环境。屏蔽了高层模块对策略和算法的直接访问
 *
 * @author Jim
 * @date 2021/05/13
 */
public class RoadNavigation {

    protected Mode mode;
    private String startingPoint;
    private String endPoint;

    public RoadNavigation(String startingPoint, String endPoint) {
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setPoint(String startingPoint, String endPoint) {
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
    }

    public void startNavigation() {
        System.out.println("开始" + mode.getName() + "导航");
        System.out.println("从" + startingPoint + "出发");
        System.out.println("期间避开" + mode.getAvoidance());
        System.out.println("到达目的地" + endPoint + "，导航结束");
    }
}
