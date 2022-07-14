package com.interview.thread.threadpool;

import java.util.Date;

public class DemoThread implements Runnable {

    private String command;

    public DemoThread(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始时间：" + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + "结束时间：" + new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "DemoThread{" +
                "command='" + command + '\'' +
                '}';
    }
}
