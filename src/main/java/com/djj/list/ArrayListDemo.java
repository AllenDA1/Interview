package com.djj.list;

import java.util.ArrayList;

public class ArrayListDemo {

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(list.size());

    }
}
