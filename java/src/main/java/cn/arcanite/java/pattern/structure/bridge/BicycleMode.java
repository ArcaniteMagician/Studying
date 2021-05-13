package cn.arcanite.java.pattern.structure.bridge;

/**
 * 扩展抽象化（Refined Abstraction）角色
 * 是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 *
 * @author Jim
 * @date 2021/05/11
 */
public class BicycleMode extends NavigationMode {

    public BicycleMode(Bicycle vehicle, String startingPoint, String endPoint) {
        super(vehicle, startingPoint, endPoint);
    }

    @Override
    public String getName() {
        return "骑行模式";
    }

    @Override
    public void showInfo() {
        // 对父类方法进行补充
        super.showInfo();
        System.out.println("建议：因为平均车速为" + vehicle.getSpeed() + "公里/时，只适合短途。");
    }
}
