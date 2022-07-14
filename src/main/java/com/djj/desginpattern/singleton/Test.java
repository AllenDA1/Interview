package com.djj.desginpattern.singleton;

public class Test {
    public static void main(String[] args) {

        //UserService1 instance = UserService1.getInstance();
        //UserService1 instance2 = UserService1.getInstance();

        //UserService2 instance = UserService2.getInstance();
        //UserService2 instance2 = UserService2.getInstance();

        UserService3 instance = UserService3.getInstance();
        UserService3 instance2 = UserService3.getInstance();



        System.out.println(instance);
        System.out.println(instance2);

        System.out.println(instance == instance2);

    }
}
