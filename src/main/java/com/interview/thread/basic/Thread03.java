package com.interview.thread.basic;

public class Thread03 extends Thread {

    // 线程的编号
    int index;

    public Thread03() {

    }

    public Thread03(int index) {
        this.index = index;
        System.out.println("正在创建线程：" + index);
    }

    @Override
    public void run() {
        // 循环打印当前次数
        for (int i = 0; i < 40; i++) {
            System.out.println("线程" + index + "正在执行");
        }
        System.out.println("线程" + index + "执行结束");
    }


    // 在main方法里创建3个线程并运行
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new Thread03(i + 1).start();
        }
    }
}
