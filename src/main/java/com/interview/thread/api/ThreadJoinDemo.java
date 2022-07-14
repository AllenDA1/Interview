package com.interview.thread.api;

public class ThreadJoinDemo extends Thread {


    public ThreadJoinDemo(String name) {
        this.setName(name);
    }

    public ThreadJoinDemo() {

    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(this.getName() + "打印了" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadJoinDemo t1 = new ThreadJoinDemo("刘备");
        ThreadJoinDemo t2 = new ThreadJoinDemo("关羽");
        ThreadJoinDemo t3 = new ThreadJoinDemo("张飞");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();

    }
}
