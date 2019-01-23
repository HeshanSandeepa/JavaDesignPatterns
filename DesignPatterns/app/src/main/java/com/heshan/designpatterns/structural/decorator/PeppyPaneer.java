package com.heshan.designpatterns.structural.decorator;

public class PeppyPaneer extends Pizza {

    public PeppyPaneer() {
        description = "PeppyPaneer";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
