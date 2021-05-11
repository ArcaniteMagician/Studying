package cn.arcanite.java.pattern.structure.bridge;

/**
 * 具体实现化（Concrete Implementor）角色
 * 给出实现化角色接口的具体实现。
 *
 * @author Jim
 * @date 2021/05/11
 */
public class Bicycle implements Vehicle {
    @Override
    public String getMode() {
        return "自行车模式";
    }
}
