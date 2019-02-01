package com.heshan.designpatterns.behavioral.chainOfResponsibiity;

public class Receiver3 extends Handler {

    @Override
    public void handleRequest() {
        // Must handle the request unconditionally.
        System.out.println("Receiver3: Handling the request.");
    }
}
