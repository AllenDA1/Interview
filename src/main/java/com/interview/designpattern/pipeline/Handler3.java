package com.interview.designpattern.pipeline;

public class Handler3 implements Handler {
    @Override
    public Boolean handle(MyContext context) {

        System.out.println("handler3 =====> 处理");
        return true;
    }

}
