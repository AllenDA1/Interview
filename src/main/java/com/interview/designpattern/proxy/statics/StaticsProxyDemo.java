package com.interview.designpattern.proxy.statics;

/**
 *
    静态代理：
        1、代理类和被代理类都需要实现同一个接口（实现同一个方法）
        2、代理类实现接口方法中 调用 被代理类的方法
        3、代理对象可以做很多被代理对象做不了的事情
        4、被代理对象可以专注于做自己的事情
 */

public class StaticsProxyDemo {

    public static void main(String[] args) {
        // 首先需要一个中介
        // 还需要一个房东

        Agency agency = new Agency(new LandLord());
        agency.rentHouse();


    }
}


interface Rent{
    void rentHouse();
}


// 房东租房
class LandLord implements Rent {

    @Override
    public void rentHouse() {
        System.out.println("房东的租房方法 ============>租到房了，开心吗");
    }
}


// 中介租房
class Agency implements Rent {


    private LandLord lord;

    public Agency(LandLord lord) {
        this.lord = lord;
    }

    @Override
    public void rentHouse() {
        before();
        lord.rentHouse();
        after();
    }

    private void after() {
        System.out.println("只能骗骗单纯的大学生了");

    }

    private void before() {
        System.out.println("唉！现在中介不好干了");
    }
}
