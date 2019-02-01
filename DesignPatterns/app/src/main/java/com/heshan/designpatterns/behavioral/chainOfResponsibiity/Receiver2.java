package com.heshan.designpatterns.behavioral.chainOfResponsibiity;

public class Receiver2 extends Handler {

    public Receiver2(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest() {
        if (canHandleRequest()) {
            System.out.println("Receiver2: Handling the request ...");
        } else {
            System.out.println("Receiver2: Passing the request along the chain ...");
            super.handleRequest();
        }
    }
}
