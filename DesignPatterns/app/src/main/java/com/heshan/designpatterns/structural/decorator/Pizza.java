package com.heshan.designpatterns.structural.decorator;

// Java program to demonstrate Decorator
// pattern

// Abstract Pizza class (All classes extend
// from this)
public abstract class Pizza {
    // it is an abstract pizza
    String description = "Unkknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}
