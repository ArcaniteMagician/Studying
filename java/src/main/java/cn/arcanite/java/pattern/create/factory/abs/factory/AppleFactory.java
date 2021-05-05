package cn.arcanite.java.pattern.create.factory.abs.factory;

import cn.arcanite.java.pattern.create.factory.abs.AbstractFactory;
import cn.arcanite.java.pattern.create.factory.abs.Watch;
import cn.arcanite.java.pattern.create.factory.abs.product.AppleWatch;
import cn.arcanite.java.pattern.create.factory.simple.Pad;
import cn.arcanite.java.pattern.create.factory.simple.product.ApplePad;

/**
 * @author Jim
 * @date 2021/05/05
 */
public class AppleFactory extends AbstractFactory {
    @Override
    public Pad createPad() {
        return new ApplePad();
    }

    @Override
    public Watch createWatch() {
        return new AppleWatch();
    }
}
