package com.interview.designpattern.singleton;


/**
 * 线程安全的立即加载
 */
public class UserService4 {
    // 定义一个自己
    private static UserService4 userService4;

    private UserService4() {

    }

    static {
        userService4 = new UserService4();
    }

    public static UserService4 getInstance() {
        return userService4;
    }



}

