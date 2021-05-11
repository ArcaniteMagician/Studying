package cn.arcanite.java.pattern.structure.bridge;

/**
 * 扩展抽象化（Refined Abstraction）角色
 * 是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 *
 * @author Jim
 * @date 2021/05/11
 */
public class CarNavigation extends RoadNavigation {

    public CarNavigation(Car vehicle, String startingPoint, String endPoint) {
        super(vehicle, startingPoint, endPoint);
    }

    @Override
    public void startNavigation() {
        this.calcOilConsumption();
        System.out.println("开始进行由" + getStartingPoint() + "到" + getEndPoint() + "的" + vehicle.getMode() + "导航");
    }

    public void calcOilConsumption() {
        System.out.println("油耗大约为30L");
    }
}
