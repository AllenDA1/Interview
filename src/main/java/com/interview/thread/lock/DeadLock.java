package com.interview.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {

    private final Object left = new Object();
    private final Object right = new Object();


    public void leftRight() throws InterruptedException {
        synchronized (left) {
            Thread.sleep(2000);
            synchronized (right) {
                System.out.println("leftRight end!");
            }
        }
    }

    public void rightLeft() throws InterruptedException {
        synchronized (right) {
            Thread.sleep(2000);
            left.wait(3000);
            /*synchronized (left) {
                System.out.println("rightLeft end!");
            }*/
        }
    }


    public static void main(String[] args) throws InterruptedException {
        DeadLock deadLock = new DeadLock();

        new Thread(() -> {
            try {
                System.out.println("拿到left锁");
                deadLock.leftRight();
                System.out.println("等待right锁");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        new Thread(() -> {
            try {
                System.out.println("拿到right锁");
                deadLock.rightLeft();
                System.out.println("等待left锁");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Lock lock = new ReentrantLock();


    }
}
