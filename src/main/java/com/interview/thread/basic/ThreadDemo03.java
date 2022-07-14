package com.interview.thread.basic;

import com.interview.thread.basic.Thread01;

public class ThreadDemo03 {


    public static void main(String[] args) {
        Thread01 th01 = new Thread01("th01");
        Thread01 th02 = new Thread01("th02");
        Thread01 th03 = new Thread01("th03");

        // 设置为守护线程
        th02.setDaemon(true);
        th03.setDaemon(true);

        th01.start();
        th02.start();
        th03.start();
    }
}
