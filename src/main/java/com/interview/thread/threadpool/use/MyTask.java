package com.interview.thread.threadpool.use;

public class MyTask implements Runnable {

    public MyTask() {

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " == >" + "Hello");
    }
}
