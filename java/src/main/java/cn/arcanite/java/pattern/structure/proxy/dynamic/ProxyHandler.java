package cn.arcanite.java.pattern.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Jim
 * @date 2021/05/05
 */
public class ProxyHandler implements InvocationHandler {

    private Object proxied;

    public ProxyHandler(Object proxied) {
        System.out.println("---动态代理---");
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("广告时间！");
        Object obj = method.invoke(proxied, args);
        System.out.println("感谢收看！");
        return obj;
    }
}
