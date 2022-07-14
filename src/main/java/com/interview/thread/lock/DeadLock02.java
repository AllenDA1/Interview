package com.interview.thread.lock;

public class DeadLock02 implements Runnable {


    // 两个静态资源
    private Object obj1 = new Object();
    private Object obj2 = new Object();

    // 标志位
    private int flag = 1;


    @Override
    public void run() {
        if (flag == 1) {
            synchronized (obj1) {
                System.out.println("flag: " + flag  + ", 锁住了共享资源obj1");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("flag: " + flag + ", 等待获取资源obj2");
            synchronized (obj2) {
                System.out.println("flag: " + flag + ", 获得资源obj2");
            }
        } else if (flag == 2) {
            synchronized (obj2) {
                System.out.println("flag: " + flag + ", 锁住了资源obj2");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("flag: " + flag + ", 等待获取资源obj1");
                synchronized (obj1) {
                    System.out.println("flag: " + flag + ", 获得资源obj1");
                }
            }
        }

    }


    public static void main(String[] args) {
        DeadLock02 lock01 = new DeadLock02();
        DeadLock02 lock02 = new DeadLock02();

        lock01.flag = 1;
        lock02.flag = 2;


        new Thread(lock01).start();
        new Thread(lock02).start();
    }
}


