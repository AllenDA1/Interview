package com.interview.designpattern.singleton.demo;


// 懒汉方式  —— 需要时才创建
public class Test2 {

    private static volatile Test2 test2;

    private Test2() {

    }


    public Test2 getTest2() {
        if (test2 == null) {
            test2 = new Test2();
        }
        return test2;
    }


}
