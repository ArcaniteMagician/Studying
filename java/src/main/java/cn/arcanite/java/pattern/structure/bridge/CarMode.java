package cn.arcanite.java.pattern.structure.bridge;

/**
 * 扩展抽象化（Refined Abstraction）角色
 * 是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 *
 * @author Jim
 * @date 2021/05/11
 */
public class CarMode extends NavigationMode {

    public CarMode(Car vehicle, String startingPoint, String endPoint) {
        super(vehicle, startingPoint, endPoint);
    }

    @Override
    public String getName() {
        return "驾车模式";
    }

    @Override
    public void showInfo() {
        // 对父类方法进行补充
        super.showInfo();
        System.out.println("建议：因为停车比较麻烦，只适合中长途。");
    }
}
