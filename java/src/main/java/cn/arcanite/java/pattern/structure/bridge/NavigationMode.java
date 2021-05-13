package cn.arcanite.java.pattern.structure.bridge;

/**
 * 抽象化（Abstraction）角色
 * 定义抽象类，并包含一个对实现化对象的引用
 *
 * @author Jim
 * @date 2021/05/11
 */
public abstract class NavigationMode {

    protected Vehicle vehicle;
    private String startingPoint;
    private String endPoint;

    public NavigationMode(Vehicle vehicle, String startingPoint, String endPoint) {
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

    public void showInfo() {
        System.out.println("名称：" + getName());
        System.out.println("速度：" + vehicle.getSpeed() + "公里/时");
    }

    public abstract String getName();
}
