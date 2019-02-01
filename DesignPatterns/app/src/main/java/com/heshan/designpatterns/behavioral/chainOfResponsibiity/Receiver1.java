package com.heshan.designpatterns.behavioral.chainOfResponsibiity;

public class Receiver1 extends Handler {

    public Receiver1(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest() {
        if (canHandleRequest()) {
            System.out.println("Receiver1: Handling the request ...");
        } else {
            System.out.println("Receiver1: Passing the request along the chain ...");
            super.handleRequest();
        }
    }
}
