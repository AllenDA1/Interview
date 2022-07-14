package com.interview.thread.threadpool;

import java.util.concurrent.*;


/**
 *
 * 底部调用：
     ThreadPoolExecutor(nThreads, nThreads,
                         0L, TimeUnit.MILLISECONDS,
                         new LinkedBlockingQueue<Runnable>());
 */

public class DemoSingleThreadPool {


    public static void main(String[] args) {

        // 一池一线程
        ExecutorService pool1 = Executors.newSingleThreadExecutor();

        // 一池10线程
        ExecutorService pool2 = Executors.newFixedThreadPool(10);

        // 一池n线程
        ExecutorService pool3 = Executors.newCachedThreadPool();

        //
        ExecutorService pool4 = Executors.newWorkStealingPool();

        // 最大线程数：Integer.MAX_VALUE,
        ExecutorService pool5 = Executors.newScheduledThreadPool(10);


        try {
            for (int i = 0; i < 10; i++) {
                pool3.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t处理业务");
                });
                TimeUnit.MICROSECONDS.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // LinkedBlockingQueue用来存放线程 --- 边界值0x7fffffff ——> 堆积太多会导致OOM

        System.out.println("========================================================================");
        // 建议：手动创建线程池
        // 7个参数
        final ExecutorService pool = new ThreadPoolExecutor(
                10,
                20,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(25),
                Executors.defaultThreadFactory()
            );

        try {
            for (int i = 0; i < 10; i++) {
                pool.execute(new Task());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }
    }
}

class Task implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "下午面试拿13k offer");
    }
}
