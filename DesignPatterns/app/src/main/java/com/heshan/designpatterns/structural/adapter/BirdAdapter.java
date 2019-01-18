/*
An Adapter Pattern says that just "converts the interface of a class into another interface that a
client wants".

In other words, to provide the interface according to client requirement while using the services
of a class with a different interface.
The Adapter Pattern is also known as Wrapper.

--------Advantage of Adapter Pattern
1. It allows two or more previously incompatible objects to interact.
2. It allows re-usability of existing functionality.

--------Usage of Adapter pattern:
1. When an object needs to utilize an existing class with an incompatible interface.
2. When you want to create a reusable class that cooperates with classes which don't have
compatible interfaces.
3. When you want to create a reusable class that cooperates with classes which don't have
compatible interfaces.

*/

package com.heshan.designpatterns.structural.adapter;

public class BirdAdapter implements ToyDuck {

    // You need to implement the interface your
    // client expects to use.
    Bird bird;
    public BirdAdapter(Bird bird) {
        // we need reference to the object we
        // are adapting
        this.bird = bird;
    }

    @Override
    public void squeak() {
        // translate the methods appropriately
        bird.makeSound();
    }
}
