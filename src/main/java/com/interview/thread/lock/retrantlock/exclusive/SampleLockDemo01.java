package com.interview.thread.lock.retrantlock.exclusive;


import java.util.concurrent.locks.ReentrantLock;

/**
 *
    独占锁和共享锁
    被单个线程持有的锁叫做独占锁，被多个线程持有的锁叫做共享锁

    独占锁：任何时候最多只能有一个线程持有该锁，如synchronized就是独占锁
            ReaderWriteLock读写锁允许多个线程进行读操作，他就是共享锁
    独占锁可以理解为悲观锁，每次访问资源都要加上互斥锁，而共享锁可以理解为乐观锁，
    它放宽了加锁的条件，允许多个线程同时访问资源

 */
public class SampleLockDemo01 {

    public static void main(String[] args) {
        fairLock();
    }

    private static void fairLock() {
        Object lock = new Object();

        ReentrantLock reentrantLock = new ReentrantLock(false);


    }
}
