package cn.arcanite.java.pattern.factory.abs;

import cn.arcanite.java.pattern.factory.simple.Pad;

/**
 * 抽象工厂模式的用意为：给客户端提供一个统一接口，可以创建多个复杂产品族中的产品对象
 *
 * @author Jim
 * @date 2021/05/05
 */
public abstract class AbstractFactory {

    public abstract Pad createPad();

    public abstract Watch createWatch();
}
