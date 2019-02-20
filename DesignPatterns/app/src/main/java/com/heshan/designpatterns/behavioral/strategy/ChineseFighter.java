package com.heshan.designpatterns.behavioral.strategy;

public class ChineseFighter extends Fighter {

    public ChineseFighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("ChineseFighter");
    }
}
