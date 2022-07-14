package com.interview.designpattern.proxy.dynamics.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyExample {

    // 接口
    static interface Car {
        void running();
    }

    static class Bus implements Car {

        @Override
        public void running() {
            System.out.println("公交车在running");
        }
    }

    static class Taxi implements Car {

        @Override
        public void running() {
            System.out.println("计程车在running");
        }
    }

    /**
     * JDK Proxy
     */
    static class JDKProxy implements InvocationHandler {

        private Object target; // 代理对象
        // 获取到代理对象
        public Object getInstance(Object target) {
            this.target = target;
            // 取得代理对象
            return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                    target.getClass().getInterfaces(), this);
        }

        // 执行代理的方法
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("代理之前的业务 =======  在此处做增强");

            // 执行调用
            Object invoke = method.invoke(target, args);

            System.out.println("代理之后的业务 =======  在此处增强");

            return invoke;
        }
    }


    public static void main(String[] args) {
        // 执行 JDK Proxy
        JDKProxy jdkProxy = new JDKProxy();
        Car instance = (Car) jdkProxy.getInstance(new Bus());

        instance.running();

    }


}
