package com.interview.designpattern.pipeline;

public class Handler4 implements Handler {
    @Override
    public Boolean handle(MyContext context) {

        System.out.println("handler4 =====> 处理");
        return true;
    }

}
