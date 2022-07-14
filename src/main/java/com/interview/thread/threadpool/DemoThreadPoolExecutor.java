package com.interview.thread.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DemoThreadPoolExecutor {


    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE  = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;


    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                // 核心线程数
                CORE_POOL_SIZE,
                // 最大线程数
                MAX_POOL_SIZE,
                // 等待时间
                KEEP_ALIVE_TIME,

                // 等待时间的单位
                TimeUnit.SECONDS,

                // 任务队列为ArrayBlockingQueue
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),

                // 饱和策略
                new ThreadPoolExecutor.CallerRunsPolicy()

        );

        for (int i = 0; i < 15; i++) {
            // 创建Worker线程，该对象需要实现Runnable接口
            Runnable worker = new DemoThread("任务" + i);

            // 通过线程池执行Runnable
            threadPoolExecutor.execute(worker);
        }

        // 终止线程
        threadPoolExecutor.shutdown();

        while (!threadPoolExecutor.isTerminated()) {

        }

        System.out.println("全部线程已经终止");
    }
}
