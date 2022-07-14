package com.interview.leetcode;


import java.util.*;

/**
 * 给定一个字符串A，字符串由所有数字和字母组成，求这个字符串里面所出现的数字和字母，同时统计这些数字和字母的出现次数。
 * 例如INPUT:A="aaaBBBaaA23"....OUTPUT:{A:1,B:3,a:5,2:1,3:1}
 */
public class Test2 {

    public static void main(String[] args) {

        String A = "aaaBBBaaA23aasd2345";

        int[] upChars = new int[26];

        int[] lowerChars = new int[26];

        int[] numbers = new int[10];


        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (Character.isUpperCase(c)) {
                upChars[c - 65]++;
                continue;
            } else if (Character.isLowerCase(c)) {
                lowerChars[c - 97]++;
            } else if (Character.isDigit(c)) {
                numbers[c - 48]++;
            }
        }

        List<Object> list = new ArrayList<>();
        HashMap<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            if (upChars[i] != 0) {
                map.put((char) ('A' + i), upChars[i]);
//                System.out.println((char) ('A' + i) + ":" + upChars[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            if (lowerChars[i] != 0) {
                map.put((char) ('a' + i), lowerChars[i]);
//                System.out.println((char) ('a' + i) + ":" + lowerChars[i]);
            }
        }

        for (int i = 0; i < 10; i++) {
            if (numbers[i] != 0) {
                map.put(i, numbers[i]);
//                System.out.println(i + ":" + numbers[i]);
            }
        }

    }
}
