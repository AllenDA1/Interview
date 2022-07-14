package com.interview.designpattern.pipeline;

public class Handler2 implements Handler {
    @Override
    public Boolean handle(MyContext context) {

        System.out.println("handler2 =====> 处理");
        return true;
    }

}
