package com.interview.thread.lock.retrantlock;



/**
 *
    可重入锁：同一个线程，外面的函数可以拥有此锁，内层的函数也可以继续获取该锁
    synchronized 和 ReentrantLock都是可重入锁

     可重入锁的实现原理，是在锁内部存储了一个线程标识，用于判断当前的锁属于哪个线程，
     并且锁的内部维护了一个计数器，当锁空闲时此计数器的值为 0，当被线程占用和重入时分别加 1，
     当锁被释放时计数器减 1，直到减到 0 时表示此锁为空闲状态。
 */
public class ReentrantLockDemo1 {


    public static void main(String[] args) {

        reentrantA();

    }

    /**
     * 可重入锁A
     */
    private static synchronized void reentrantA() {
        System.out.println(Thread.currentThread().getName() + "执行 reentrantA");
        reentrantB();
    }

    /**
     * 可重入锁B
     */
    private static synchronized void reentrantB() {
        System.out.println(Thread.currentThread().getName() + "执行 reentrantB");
    }



}
