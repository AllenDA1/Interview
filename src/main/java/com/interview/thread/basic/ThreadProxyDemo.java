package com.interview.thread.basic;


public class ThreadProxyDemo {

    public static void main(String[] args) {

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + i+1 + " yes! 我了解lambda表达式了");
            }
        });

        Thread th2 = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i+1 + "ok, 冲冲冲！");
            }
        }, "线程2");

        th1.start();
        th2.start();
    }
}
