package com.heshan.designpatterns.structural.decorator;

public class FarmHouse extends Pizza {

    public FarmHouse() {
        description = "FarmHouse";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
