/*

Strategy Pattern

A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable".
The Strategy Pattern is also known as Policy.

Benefits:

1. It provides a substitute to subclassing.
2. It defines each behavior within its own class, eliminating the need for conditional statements.
3. It makes it easier to extend and incorporate new behavior without changing the application.

Usage:

1. When the multiple classes differ only in their behaviors.e.g. Servlet API.
2. It is used when you need different variations of an algorithm.

*/



package com.heshan.designpatterns.behavioral.strategy;

public abstract class Fighter {

    KickBehavior kickBehavior;
    JumpBehavior jumpBehavior;

    public Fighter(KickBehavior kickBehavior,
                   JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
        this.kickBehavior = kickBehavior;
    }

    public void punch() {
        System.out.println("Default Punch");
    }

    public void kick() {
        // delegate to kick behavior
        kickBehavior.kick();
    }

    public void jump() {
        // delegate to jump behavior
        jumpBehavior.jump();
    }

    public void roll() {
        System.out.println("Default Roll");
    }

    public void setKickBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }

    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    public abstract void display();
}
