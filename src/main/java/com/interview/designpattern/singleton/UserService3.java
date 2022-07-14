package com.interview.designpattern.singleton;

/**
 * 立即加载
 */
public class UserService3 {

    // 定义一个自己的成员变量
    private static UserService3 userService3 = new UserService3();

    // 定义一个私有的构造方法
    private UserService3() {

    }

    // 定义一个获取实例的方法
    public static UserService3 getUserService3() {
        return userService3;
    }

}
