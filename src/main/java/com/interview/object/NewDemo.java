package com.interview.object;

public class NewDemo {

    public static void main(String[] args) {

        A a = new A();

        System.out.println("=================");

        B b = new B();
    }

}


class A {

    static {
        System.out.println("A static");
    }
    public A() {
        System.out.println("A Constructor");
    }
}

class B extends A {

    static {
        System.out.println("B static");
    }

    public B() {
        System.out.println("B Constructor");
    }
}
