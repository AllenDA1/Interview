package com.interview.thread.basic;

import java.util.concurrent.*;

/**
 * 多线程的实现方式3

    1、实现Callable接口，并重写call方法
    2、创建执行服务
    3、提交执行
    4、获取结构

 */


public class ThreadCallableDemo implements Callable {
    @Override
    public String call() throws Exception {

        return "test test test";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadCallableDemo demo1 = new ThreadCallableDemo();
        ThreadCallableDemo demo2 = new ThreadCallableDemo();
        ThreadCallableDemo demo3 = new ThreadCallableDemo();

        // 创建执行服务
        ExecutorService service = Executors.newFixedThreadPool(3);

        // 提交执行
        Future r1 = service.submit(demo1);
        Future r2 = service.submit(demo1);
        Future r3 = service.submit(demo1);


        // 获取结果
        String o1 = (String) r1.get();
        String o2 = (String) r2.get();
        String o3 = (String) r3.get();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        // 关闭服务
        service.shutdownNow();
    }
}












