package com.interview.designpattern.pipeline;

public class Handler1 implements Handler {
    @Override
    public Boolean handle(MyContext context) {

        System.out.println("handler1 =====> 处理");
        return true;
    }

}
