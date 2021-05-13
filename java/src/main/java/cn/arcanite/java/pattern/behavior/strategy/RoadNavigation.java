package cn.arcanite.java.pattern.behavior.strategy;

/**
 * 抽象化（Abstraction）角色
 * 定义抽象类，并包含一个对实现化对象的引用
 *
 * @author Jim
 * @date 2021/05/11
 */
public abstract class RoadNavigation {

    protected Vehicle vehicle;
    private String startingPoint;
    private String endPoint;

    public RoadNavigation(Vehicle vehicle, String startingPoint, String endPoint) {
        this.vehicle = vehicle;
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public abstract void startNavigation();
}
