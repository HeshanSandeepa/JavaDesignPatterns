package com.heshan.designpatterns.behavioral.strategy;

public class RussianFighter extends Fighter {

    public RussianFighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("RussianFighter");
    }

}
