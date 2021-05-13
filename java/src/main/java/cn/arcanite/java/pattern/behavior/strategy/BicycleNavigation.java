package cn.arcanite.java.pattern.behavior.strategy;

/**
 * 扩展抽象化（Refined Abstraction）角色
 * 是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 *
 * @author Jim
 * @date 2021/05/11
 */
public class BicycleNavigation extends RoadNavigation {

    public BicycleNavigation(Bicycle vehicle, String startingPoint, String endPoint) {
        super(vehicle, startingPoint, endPoint);
    }

    @Override
    public void startNavigation() {
        // 扩展抽象化角色中自由实现的方法
        this.calcPhysicalExertion();
        // 调用实现化角色中的具体方法
        System.out.println("开始进行由" + getStartingPoint() + "到" + getEndPoint() + "的" + vehicle.getMode() + "导航");
    }

    private void calcPhysicalExertion() {
        System.out.println("体力消耗大约为3000千卡");
    }
}
