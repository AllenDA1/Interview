package com.interview.thread.basic;


import com.interview.thread.basic.Thread01;
import com.interview.thread.basic.Thread02;

/**
 * 一个线程的生命周期：
 * 新建 ——> 启动 ——> 就绪 ——> 执行 ——> 死亡（阻塞）
 *
 *
 * 新建(new Thread) ——> 执行（Thread.start）——> 就绪状态（此时等待线程执行所必需的资源，cpu执行时间）
 *  ——> 执行(Thread.run()  通过系统调度，获得了cpu执行时间) ——> 死亡/阻塞
 */
public class ThreadDemo01 {


    public static void main(String[] args) {

        Thread01 th01 = new Thread01("th01");     // 此时线程1处于新建状态

        /*
               线程执行start()方法后，会先判断threadStatus是否为0,不为0则抛出线程状态非法异常（默认为0，表明线程尚未启动）
               之后将当前线程加入线程组

         */
        th01.start();   // 此时线程01处于就绪状态，等待JVM线程调度器的调度


        /*
                如果就绪状态的线程获得了CPU资源，就可以执行run（）方法，此时线程就进入了执行状态，处于运行状态的线程最为复杂，
                它可以变成阻塞、就绪、死亡状态

         */



        Thread02 th02 = new Thread02();
        th02.run();

        System.out.println(th01.getPriority());

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is Thread03");
            }
        }, "th03");

        System.out.println(thread.getName());
        System.out.println(thread.getId());
    }
}


