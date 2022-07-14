package com.interview.designpattern.pipeline;


/**
 * 测试方法
 */
public class PipelineMain {

    public static void main(String[] args) {

        OrderPipeline orderPipeline = new OrderPipeline(new MyContext("lucas"));
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();
        Handler4 handler4 = new Handler4();

        orderPipeline.addHead(handler1, handler2, handler3, handler4);

        orderPipeline.start();

    }

}
