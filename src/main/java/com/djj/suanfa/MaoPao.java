package com.djj.suanfa;

/**
 * 冒泡排序算法
 *
 * 比较相邻元素，如果1>2，就交换
 * 对每一对相邻元素z做相同的工作，从开始第一对到最后一对，最后，结尾元素就是最大的值
 *
 */
public class MaoPao {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 5, 8, 2, 3, 9, 4};

        //需要进行length - 1次冒泡

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        System.out.println("从小到大排序后结果是");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
