package com.interview.thread.basic;

import com.interview.thread.basic.MyRunnable;

public class ThreadDemo02 {


    public static void main(String[] args) {

        MyRunnable thread110 = new MyRunnable("Thread110");
        thread110.start();


        MyRunnable thread120 = new MyRunnable("Thread120");
        thread120.start();
    }
}
