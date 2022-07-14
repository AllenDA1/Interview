package com.interview.string;


public class StringDemo {

    public static void main(String[] args) {
        String str = "Hello";

        String str1 = new String("World");

        // 字符串反转
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);


        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer reverse1 = stringBuffer.reverse();
        System.out.println(reverse1);
    }
}
