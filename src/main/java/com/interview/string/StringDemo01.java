package com.interview.string;

public class StringDemo01 {

    public static void main(String[] args) {
        String str = "hello";

        change1(str);

        System.out.println(str);
    }


    private static void change1(String str) {
        str = "world";
    }

}
