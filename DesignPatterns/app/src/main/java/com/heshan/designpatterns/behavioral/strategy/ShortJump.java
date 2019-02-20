package com.heshan.designpatterns.behavioral.strategy;

public class ShortJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Short Jump");
    }
}
