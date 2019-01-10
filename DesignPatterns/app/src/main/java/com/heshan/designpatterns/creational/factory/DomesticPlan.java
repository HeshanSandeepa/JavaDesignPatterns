package com.heshan.designpatterns.creational.factory;

public class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 3.50;
    }
}
