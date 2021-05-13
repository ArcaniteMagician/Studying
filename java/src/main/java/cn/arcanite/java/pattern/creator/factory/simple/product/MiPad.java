package cn.arcanite.java.pattern.creator.factory.simple.product;

import cn.arcanite.java.pattern.creator.factory.simple.Pad;

/**
 * 具体产品类：要创建的产品。
 * @author Jim
 * @date 2021/05/05
 */
public class MiPad extends Pad {
    @Override
    public void showName() {
        System.out.println("I am MiPad!");
    }
}
