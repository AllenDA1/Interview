package com.djj.reentrantlock;

public class Widget {
    public synchronized void doSomething() {
        System.out.println("doSomething");
        doOthers();
    }

    private void doOthers() {
        System.out.println("doOthers");
    }

    public static void main(String[] args) {
        Widget widget = new Widget();
        widget.doSomething();
    }
}
