package com.interview.thread.basic;

public class MyRunnable implements Runnable {

    private Thread t;

    private String thName;

    public MyRunnable(String thName) {
        this.thName = thName;
    }

    @Override
    public void run() {

        System.out.println("running" + thName);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: " + thName + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  thName + " interrupted.");
        }

        System.out.println("Thread " + thName + "exiting");
    }

    public void start() {
        System.out.println("Starting " + thName);
        if (t == null) {
            t = new Thread(this, thName);
            t.start();
        }
    }


}
