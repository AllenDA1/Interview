package com.interview.thread.basic;


// 线程的创建方式一: 继承Thread类
public class Thread01 extends Thread{

    public Thread01(String thName) {
        this.setName(thName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("正在执行。。。。 " + this.getName() + "————>" + i);
            if (i == 40 && "th01".equals(this.getName())) {
                try {
                    this.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
