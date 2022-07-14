package com.interview.string;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        String str = " He LL o W o r ld ! ";

        String trim = str.trim();//去掉首尾空格
        String replace = str.replace(" ", "");
        String all = str.replaceAll(" ", "");

        String s = str.replaceAll(" +", "");//去掉所有空格，包括首尾、中间


        ArrayList<Object> list = new ArrayList<>();



        System.out.println(trim);
        System.out.println(replace);
        System.out.println(all);

    }

}
