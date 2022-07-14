package com.interview.thread.lock;

public class LockTest {

    public static void main(String[] args) {
        Object obj = new Object();

        for (int i = 0; i < 9; i++) {
            new Thread1(obj).start();
            new Thread2(obj).start();
        }

    }



}





class Thread1 extends Thread {

    private Object obj;



    public Thread1() {
    }

    public Thread1(Object obj1) {
        this.obj = obj1;
    }

    @Override
    public void run() {
        synchronized (obj) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("给我钱");

    }
}

class Thread2 extends Thread {

    private Object obj;


    public Thread2() {
    }

    public Thread2(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) {
            System.out.println("给我烟");
        }



    }
}
