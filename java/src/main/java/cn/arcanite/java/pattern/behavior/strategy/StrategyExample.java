package cn.arcanite.java.pattern.behavior.strategy;

/**
 * 策略（Strategy）模式
 * 定义：定义一系列的算法，将每一个算法都封装起来，并且可相互替换。这使得算法可以独立于调用者而单独变化。
 * 优点：策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的策略
 * 缺点：上层模块必须知道有哪些策略类，与迪米特原则相违背
 *
 * @author Jim
 * @date 2021/05/13
 */
public class StrategyExample {

    public static void test() {
        RoadNavigation roadNavigation = new RoadNavigation("杭州", "上海");
        Mode rideMode = new RideMode();
        roadNavigation.setMode(rideMode);
        roadNavigation.startNavigation();

        Mode driveMode = new DriveMode();
        roadNavigation.setPoint("上海", "杭州");
        roadNavigation.setMode(driveMode);
        roadNavigation.startNavigation();
    }
}
