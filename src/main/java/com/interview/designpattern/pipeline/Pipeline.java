package com.interview.designpattern.pipeline;

public interface Pipeline {

    /**
     * 启动管道
     */
    void start();


    /**
     * 得到MyContext
     */
    MyContext getContext();


    /**
     * 添加到队首
     */
    void addHead(Handler... handlers);


    /**
     * 添加到队尾
     */
    void addTail(Handler... handlers);
}
