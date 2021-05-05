package cn.arcanite.java.pattern.create.factory.simple;

import cn.arcanite.java.pattern.create.factory.simple.product.ApplePad;
import cn.arcanite.java.pattern.create.factory.simple.product.HuaweiPad;
import cn.arcanite.java.pattern.create.factory.simple.product.MiPad;

/**
 * 简单工厂模式，也称为静态工厂方法模式，由一个工厂对象决定创建出哪一种产品类的实例。
 * 简单工厂模式中有如下角色：
 * 工厂类：核心，负责创建所有实例的内部逻辑，由外界直接调用。
 * 抽象产品类：所有工厂产品的抽象父类，负责描述所有实例共有的公共接口。
 * 具体产品类：要创建的产品。
 *
 * 优点：创建对象时，如果有创建对象的过程比较复杂（如要使用单例模式、代理模式等），使用工厂模式进行创建，可以使得代码看起来更简洁。并且，如果后续要进行调整，在工厂模式下代码的可维护性也更强。
 *
 * @author Jim
 * @date 2021/05/05
 */
public class Factory {

    public static Pad createPad(String brand) {
        // 它需要知道所有产品类型，因此只适合工厂类负责创建的对象比较少的情况。
        // 增加新产品品牌需要修改工厂，违背开放封闭原则。
        Pad pad;
        switch (brand) {
            case "Apple":
                pad = new ApplePad();
                break;

            case "Huawei":
                pad = new HuaweiPad();
                break;

            case "Xiaomi":
                pad = new MiPad();
                break;

            default:
                pad = null;
                break;
        }
        return pad;
    }
}
