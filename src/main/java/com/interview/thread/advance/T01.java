package com.interview.thread.advance;


import java.util.concurrent.atomic.AtomicInteger;

public class T01 {


    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        AtomicInteger i = new AtomicInteger();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始执行线程1");
                while (!flag) {

                }
                System.out.println("线程1执行完毕！");
            }
        }).start();

        Thread.sleep(3000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始执行线程2");
                flag = true;
                System.out.println("线程2执行完毕");
            }
        }).start();

    }

}
