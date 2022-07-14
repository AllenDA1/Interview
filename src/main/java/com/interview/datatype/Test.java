package com.interview.datatype;

public class Test {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        Long c = 20L;
        Long d = 10L;

        System.out.println(c == (a+b));
        System.out.println(c.equals(a + b));
        System.out.println(c == (a + d));
        System.out.println(c.equals(a + d));
    }
}
