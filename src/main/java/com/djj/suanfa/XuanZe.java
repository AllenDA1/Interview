package com.djj.suanfa;

public class XuanZe {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 5, 8, 2, 3, 9, 4};

        int temp;
        int minIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            minIndex = i;

            //从i之后开始寻找比最小索引i更小的值，遍历结束后，交换第一个元素和minIndex，保证数组中第一个元素值为最小
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            //将这一轮的最小元素和开始元素i进行交换
            temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

        }
        System.out.println("从小到大排序后结果是");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
