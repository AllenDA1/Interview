package com.interview.designpattern.singleton;


/**
 * 不安全的懒加载
 */
public class UserService1 {

    // 自己定义一个成员变量
    private static UserService1 userService;

    // 构造方法私有
    private UserService1() {

    }

    // 提供一个方法获得实例
    public static UserService1 getUserService() {
        if (userService == null) {
            userService = new UserService1();
        }
        return userService;
    }
}
