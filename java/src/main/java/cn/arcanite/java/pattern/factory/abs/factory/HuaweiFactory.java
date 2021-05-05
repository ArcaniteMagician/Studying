package cn.arcanite.java.pattern.factory.abs.factory;

import cn.arcanite.java.pattern.factory.abs.AbstractFactory;
import cn.arcanite.java.pattern.factory.abs.Watch;
import cn.arcanite.java.pattern.factory.abs.product.HuaweiWatch;
import cn.arcanite.java.pattern.factory.simple.Pad;
import cn.arcanite.java.pattern.factory.simple.product.HuaweiPad;

/**
 * @author Jim
 * @date 2021/05/05
 */
public class HuaweiFactory extends AbstractFactory {
    @Override
    public Pad createPad() {
        return new HuaweiPad();
    }

    @Override
    public Watch createWatch() {
        return new HuaweiWatch();
    }
}
