package com.interview.thread.threadpool.use;

import java.util.concurrent.*;

public class MyThreadPool {

    public static void main(String[] args) {
        ExecutorService pool1 = new ThreadPoolExecutor(
                // 核心线程数
                1,
                // 最大线程数
                3,
                // 线程存活时间
                2000,
                // 存活时间单位
                TimeUnit.MICROSECONDS,
                // 线程池的执行的任务队列
                new SynchronousQueue<>(),
                // 创建线程的工厂
                Executors.defaultThreadFactory(),

                // 线程池的拒绝策略
                new ThreadPoolExecutor.AbortPolicy()
                );


        /*for (int i = 0; i < 3; i++) {
            pool1.execute(new MyTask());
        }*/



        ExecutorService pool2 = new ThreadPoolExecutor(1, 3, 1000, TimeUnit.MICROSECONDS,
                new ArrayBlockingQueue<Runnable>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
                );

        for (int i = 0; i < 10; i++) {
            pool2.execute(new MyTask());
        }
        pool2.shutdown();

    }


}
