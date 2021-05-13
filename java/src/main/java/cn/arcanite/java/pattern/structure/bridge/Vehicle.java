package cn.arcanite.java.pattern.structure.bridge;

/**
 * 实现化（Implementor）角色
 * 定义实现化角色的接口，供扩展抽象化角色调用。
 * 实现化角色则往往仅为实现抽象化角色的相关行为而存在。
 *
 * @author Jim
 * @date 2021/05/11
 */
public interface Vehicle {
    float getSpeed();
}
