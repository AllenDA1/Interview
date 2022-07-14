package com.qijing;

/**
 * Given an array of ints = [6, 4, -3, 5, -2, -1, 0, 1, -9], implement a function
 * to move all positive numbers to the left, and move all negative numbers to the right.
 * Try your best to make its time complexity to O(n), and space complexity to O(1).
 *
 * 双指针从两侧向中间开始遍历，左侧碰到负数,右侧碰到正数，就交换元素
 */
public class Question1 {

    static int[] ints = new int[]{6, 4, -3, 5, -2, -1, 0, 1, -9};

    public static void intsSort(int[] ints) {

        int left = 0;

        int right = ints.length - 1;

        //这里要用 < 判定
        while (left < right) {

            if (ints[left] > 0) left++;

            if (ints[right] < 0) right--;

            if (ints[left] < 0 || ints[right] > 0) swap(ints, left, right);

        }

    }

    public static void swap(int ints[], int left, int right) {
        int temp;
        temp = ints[left];
        ints[left] = ints[right];
        ints[right] = temp;
    }

    public static void main(String[] args) {
        System.out.println("原数组： ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println();

        intsSort(ints);

        System.out.println("排序后数组：");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ", ");
        }
    }
}
