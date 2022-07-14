package com.djj.string;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("this is ").append("a simple").append("example");

        System.out.println(sb);
    }
}
