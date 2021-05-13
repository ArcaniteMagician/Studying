package cn.arcanite.java.pattern.creator.factory.abs.product;

import cn.arcanite.java.pattern.creator.factory.abs.Watch;

/**
 * @author Jim
 * @date 2021/05/05
 */
public class AppleWatch extends Watch {
    @Override
    public void showName() {
        System.out.println("I am Apple Watch S6!");
    }
}
