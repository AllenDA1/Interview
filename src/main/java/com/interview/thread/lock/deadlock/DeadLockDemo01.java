package com.interview.thread.lock.deadlock;

import java.util.concurrent.TimeUnit;

public class DeadLockDemo01 {

    public static void main(String[] args) {
        deadLock();
    }

    private static void deadLock() {
        // 共享资源
        Object lock1 = new Object();
        Object lock2 = new Object();


        // 线程一拥有lock1，试图获取lock2
        new Thread(()-> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + "获取lock1成功");
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 试图获取lock2
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "得到了lock2");
                }
            }
        }).start();


        // 线程二拥有lock2 试图获取lock1
        new Thread(()-> {
            System.out.println(Thread.currentThread().getName() + "获取lock2成功");
            synchronized (lock2) {
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 试图获取lock1
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + "得到了lock1");
            }


        }).start();





    }


}
