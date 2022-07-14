package com.interview.designpattern.proxy.dynamics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyIml {

    //委托类对象
    HouseOwner houseOwner = new HouseOwner();
    //jdk动态代理对象要通过接口来接收
    Rent houseProxy = (Rent) Proxy.newProxyInstance(houseOwner.getClass().getClassLoader(),
            houseOwner.getClass().getInterfaces(),
            new InvocationHandler() {


                // 当代理对象去执行方法时，会回到invoke方法
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("rentHouse".equals(method.getName())) {
                        args[0] = (int)args[0] - 500;
                    }
                    Object invoke = method.invoke(proxy, args);
                    System.out.println(method.getName());
                    return invoke;
                }
            });

    public static void main(String[] args) {
        ProxyIml iml = new ProxyIml();
        iml.houseProxy.hello();
    }
}
