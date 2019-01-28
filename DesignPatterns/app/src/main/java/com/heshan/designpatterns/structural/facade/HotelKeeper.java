
//https://www.geeksforgeeks.org/facade-design-pattern-introduction/

/*

-----When Should this pattern be used
The facade pattern is appropriate when you have a complex system that you want to expose to clients
in a simplified way, or you want to make an external communication layer over an existing
system which is incompatible with the system. Facade deals with interfaces,
not implementation. Its purpose is to hide internal complexity behind a single interface
that appears simple on the outside.

*/



package com.heshan.designpatterns.structural.facade;

//facade
public class HotelKeeper {

    public String getVeganMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        String veganMenu = vegRestaurant.getMenus();
        return veganMenu;
    }

    public String getNonVeganMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        String noVeganMenu = nonVegRestaurant.getMenus();
        return noVeganMenu;
    }
}
