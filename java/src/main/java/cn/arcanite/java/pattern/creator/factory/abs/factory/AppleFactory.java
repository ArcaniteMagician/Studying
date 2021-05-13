package cn.arcanite.java.pattern.creator.factory.abs.factory;

import cn.arcanite.java.pattern.creator.factory.abs.AbstractFactory;
import cn.arcanite.java.pattern.creator.factory.abs.Watch;
import cn.arcanite.java.pattern.creator.factory.abs.product.AppleWatch;
import cn.arcanite.java.pattern.creator.factory.simple.Pad;
import cn.arcanite.java.pattern.creator.factory.simple.product.ApplePad;

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
