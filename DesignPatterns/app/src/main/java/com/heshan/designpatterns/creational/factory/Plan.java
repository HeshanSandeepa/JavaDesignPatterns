/*
Factory Method Pattern

        A Factory Pattern or Factory Method Pattern says that just define an interface or abstract
        class for creating an object but let the subclasses decide which class to instantiate.
        In other words, subclasses are responsible to create the instance of the class.

        The Factory Method Pattern is also known as Virtual Constructor.

        Advantage of Factory Design Pattern

        1. Factory Method Pattern allows the sub-classes to choose the type of objects to create.
        2. It promotes the loose-coupling by eliminating the need to bind application-specific classes
            into the code. That means the code interacts solely with the resultant interface or abstract
            class, so that it will work with any classes that implement that interface or that extends
            that abstract class.

        Usage of Factory Design Pattern

        1. When a class doesn't know what sub-classes will be required to create
        2. When a class wants that its sub-classes specify the objects to be created.
        3. When the parent classes choose the creation of objects to its sub-classes.
*/


package com.heshan.designpatterns.creational.factory;

public abstract class Plan {
    double rate;
    public abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
