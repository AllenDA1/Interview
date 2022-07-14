package com.djj.desginpattern.singleton;

/**
 * 线程不安全的懒加载
 */
public class UserService1 {

    private static UserService1 userService1;

    //私有的构造方法
    private UserService1() {}

    //方法返回单例

    public static UserService1 getInstance() {
        if (userService1 == null) {
            userService1 = new UserService1();
        }
        return userService1;
    }
}
