package com.interview.string;

public class StringConcatDemo1 {


    public static void main(String[] args) {
        /*String s = "hello" + "world" + "interview";
        System.out.println(s);*/

        String s1 = "hello";

        for (int i = 0; i < 100; i++) {
            s1 += i;
        }
        System.out.println(s1);
    }
}
