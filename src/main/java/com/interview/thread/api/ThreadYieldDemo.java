package com.interview.thread.api;

public class ThreadYieldDemo extends Thread {

    public ThreadYieldDemo(String name) {
        this.setName(name);
    }

    public ThreadYieldDemo() {

    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i == 25 && "关羽".equals(this.getName())) {
                Thread.yield();
            }
            System.out.println(this.getName() + "打印了" + i);
        }
    }

    public static void main(String[] args) {
        ThreadYieldDemo th01 = new ThreadYieldDemo("张飞");
        ThreadYieldDemo th02 = new ThreadYieldDemo("关羽");

        th01.start();
        th02.start();


    }

}
