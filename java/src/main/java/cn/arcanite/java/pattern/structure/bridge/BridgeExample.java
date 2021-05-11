package cn.arcanite.java.pattern.structure.bridge;

/**
 * 桥接模式
 * 定义：将抽象与实现分离，使它们可以独立变化。用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 * 优点：抽象与实现分离，扩展能力强；其实现细节对客户透明
 * 场景：某对象包含多种灵活多变的属性时，将共性封装到抽象化角色中，将不同的属性抽象出共同接口定义实现化角色，每个具体实现化角色不同的实现了具体方法的扩展抽象化角色
 *
 * @author Jim
 * @date 2021/05/11
 */
public class BridgeExample {

    public static void test() {
        Bicycle bicycle = new Bicycle();
        RoadNavigation roadNavigation1 = new BicycleNavigation(bicycle, "上海", "杭州");
        roadNavigation1.startNavigation();

        Car car = new Car();
        RoadNavigation roadNavigation2 = new CarNavigation(car, "上海", "杭州");
        roadNavigation2.startNavigation();
    }
}
