package com.djj.desginpattern.singleton;

/**
 * 线程安全立即加载
 */
public class UserService2 {

    private static UserService2 userService2;

    //静态代码块直接加载
    static {
        userService2 = new UserService2();
    }
    private UserService2() {}

    public static UserService2 getInstance() {
        return userService2;
    }
}
