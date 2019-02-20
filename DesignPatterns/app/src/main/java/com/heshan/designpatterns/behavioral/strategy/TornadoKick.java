package com.heshan.designpatterns.behavioral.strategy;

public class TornadoKick implements KickBehavior {
    @Override
    public void kick() {
        System.out.println("Tornado Kick");
    }
}
