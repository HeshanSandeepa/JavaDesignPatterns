package com.heshan.designpatterns.structural.decorator;

// Concrete toppings classes

public class FreshTomato extends ToppingsDecorator {

    // we need a reference to obj we are decorating
    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato ";
    }

    @Override
    public int getCost() {
        return 40 + pizza.getCost();
    }
}
