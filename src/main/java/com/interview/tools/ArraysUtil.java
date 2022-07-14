package com.interview.tools;

import java.util.Arrays;

public class ArraysUtil {


    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2, 4, 6, 9, 5};
        int i = Arrays.binarySearch(arr, 3);
        System.out.println(i);

    }
}
