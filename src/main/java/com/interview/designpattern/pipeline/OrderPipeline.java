package com.interview.designpattern.pipeline;

public class OrderPipeline implements Pipeline {

    private HandlerNode head = new HandlerNode();

    private HandlerNode tail;

    private MyContext context;

    public OrderPipeline(MyContext context) {
        this.context = context;
    }

    @Override
    public void start() {
        head.getNext().exec(context);
    }

    @Override
    public MyContext getContext() {
        return context;
    }

    /**
     * 添加Handler到头部
     *
     * @param handlers
     */
    @Override
    public void addHead(Handler... handlers) {
        // 1、拿到第一个真正意义的节点
        HandlerNode next = head.getNext();

        // 2、依次将Handler添加到头部
        for (Handler handler : handlers) {
            HandlerNode handlerNode = new HandlerNode();
            handlerNode.setHandler(handler);

            handlerNode.setNext(next);
            next = handlerNode;
        }

        // 3、将head指向最后插入的Handler
        head.setNext(next);
    }


    /**
     * 添加Handler到尾部
     * @param handlers
     */
    @Override
    public void addTail(Handler... handlers) {
        HandlerNode node = tail;

        for (Handler handler : handlers) {
            HandlerNode handlerNode = new HandlerNode();
            handlerNode.setHandler(handler);

            node.setNext(handlerNode);
            node = handlerNode;
        }
        tail = node;

    }
}
