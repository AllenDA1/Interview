package com.interview.thread.basic;

public class Test {


    public static void main(String[] args) {


        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("yes");
                }
            }).start();

        }
    }
}
