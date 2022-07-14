package com.interview.designpattern.singleton.demo;


import com.interview.string.Test;

// 饿汉方式 —— 需不需要都会创建
public class Test1 {

    private static Test test = new Test();


    private Test1() {

    }

    public Test getTest() {
        return test;
    }

}
