package com.interview.jdk8.lam;


/**
 * 函数式接口 —— 接口中只定义了一个方法
 */
public class LambdaDemo1 {

    public static void main(String[] args) {

        new Thread(()-> {

        });

        ILike demo01;

        demo01 = () -> {
            System.out.println("yes");
        };
    }

}

interface ILike {
    void say();
}

interface IDemo02 {
    int age();
}
