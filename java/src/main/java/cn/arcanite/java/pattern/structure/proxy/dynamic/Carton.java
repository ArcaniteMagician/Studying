package cn.arcanite.java.pattern.structure.proxy.dynamic;

/**
 * 额外的抽象主题并不会影响动态代理，因为动态代理对象在创建时需要强转为具体的某个抽象主题（接口），如果InvocationHandler未现实该接口，强转会失败
 *
 * @author Jim
 * @date 2021/05/05
 */
public interface Carton {
    void test();
}
