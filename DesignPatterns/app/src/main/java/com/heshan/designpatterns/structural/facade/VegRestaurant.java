package com.heshan.designpatterns.structural.facade;

public class VegRestaurant implements Hotel {
    @Override
    public String getMenus() {
        return "VegRestaurant";
    }
}
