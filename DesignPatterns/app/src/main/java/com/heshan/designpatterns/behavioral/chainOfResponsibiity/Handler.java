package com.heshan.designpatterns.behavioral.chainOfResponsibiity;

public abstract class Handler {

    private Handler successor;

    public Handler() {

    }

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest() {
        // Forwarding to successor (if any).
        if (successor != null) {
            successor.handleRequest();
        }
    }

    public boolean canHandleRequest() {
        // Checking run-time conditions ...
        return false;
    }
}
