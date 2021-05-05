package cn.arcanite.java.pattern.create.factory.abs.product;

import cn.arcanite.java.pattern.create.factory.abs.Watch;

/**
 * @author Jim
 * @date 2021/05/05
 */
public class HuaweiWatch extends Watch {
    @Override
    public void showName() {
        System.out.println("I am GT 2!");
    }
}
