package com.interview.thread.api;

public class ThreadDeamonDemo extends Thread {

    public ThreadDeamonDemo(String name) {
        this.setName(name);
    }

    public ThreadDeamonDemo() {

    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(this.getName() + "打印了" + i);
        }
    }

    public static void main(String[] args) {
        ThreadDeamonDemo th1 = new ThreadDeamonDemo("关羽");
        ThreadDeamonDemo th2 = new ThreadDeamonDemo("张飞");

        th1.setDaemon(true);
        th2.setDaemon(true);
        th1.start();
        th2.start();

        for (int i = 1; i <= 20; i++) {
            System.out.println("刘备打印了" + i);
        }
    }
}
