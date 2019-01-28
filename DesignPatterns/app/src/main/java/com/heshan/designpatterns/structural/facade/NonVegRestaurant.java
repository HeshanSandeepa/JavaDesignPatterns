package com.heshan.designpatterns.structural.facade;

public class NonVegRestaurant implements Hotel {
    @Override
    public String getMenus() {
        return "NonVegRestaurant";
    }
}
