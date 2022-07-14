package com.interview.designpattern.singleton;


/**
 * 安全的懒加载
 */
public class UserService2 {

    // 定义一个自己
    private static UserService2 userService2;

    // 定义一个私有构造方法
    private UserService2() {

    }

    // 定义一个获取实例的方法
    private static synchronized UserService2 getUserService2() {

        if (userService2 == null) {
            userService2 = new UserService2();
        }
        return userService2;

    }



}
