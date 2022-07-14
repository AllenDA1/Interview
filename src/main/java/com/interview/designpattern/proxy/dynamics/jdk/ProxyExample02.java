package com.interview.designpattern.proxy.dynamics.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyExample02 {


    // 共同接口
    static interface Car {
        void running();
    }

    // 委托类
    static class Taxi implements Car {
        @Override
        public void running() {
            System.out.println("Taxi running");
        }
    }

    // 代理类 --> 获取代理对象
    static class JDKProxy implements InvocationHandler {

        // 代理对象
        private Object target;

        // 获取代理对象
        public Object getInstance(Object target) {
            this.target = target;
            return  Proxy.newProxyInstance(target.getClass().getClassLoader(),
                    target.getClass().getInterfaces(), this);

        }

        // 执行代理方法
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("执行代理方法之前做增强");
            Object invoke = method.invoke(target, args);
            System.out.println("执行代理方法之后做增强");

            return invoke;
        }
    }

    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        Car instance = (Car) jdkProxy.getInstance(new Taxi());
        instance.running();
    }

}
