package com.interview.exception;

public class ExceptionDemo {

    public static void main(String[] args) {
        System.out.println(111);
        int res = add(1,0);

    }

    private static int add (int a, int b){
        int c;
        try {
            c = a / b;
        } catch (Exception e) {

            e.printStackTrace();
            throw new ArithmeticException("除0异常");
        } finally {
            System.out.println("yes");
        }
        return c;
    }
}
