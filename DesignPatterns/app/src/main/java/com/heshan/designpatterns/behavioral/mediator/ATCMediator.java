/*

The Mediator defines an object that controls how a set of objects interact. Loose coupling between
colleague objects is achieved by having colleagues communicate with the Mediator,
rather than with each other.

Check list
1. Identify a collection of interacting objects that would benefit from mutual decoupling.
2. Encapsulate those interactions in the abstraction of a new class.
3. Create an instance of that new class and rework all "peer" objects to interact with the Mediator only.
4. Balance the principle of decoupling with the principle of distributing responsibility evenly.
5. Be careful not to create a "controller" or "god" object.


Advantage

It limits subclassing. A mediator localizes behavior that otherwise would be distributed among several
objects. Changing this behaviour requires subclassing Mediator only, Colleague classes can be reused
as is.

Disadvantage

It centralizes control. The mediator pattern trades complexity of interaction for complexity in the
mediator. Because a mediator encapsulates protocols, it can become more complex than any individual
colleague. This can make the mediator itself a monolith that’s hard to maintain

*/


package com.heshan.designpatterns.behavioral.mediator;

public class ATCMediator implements IATCMediator {

    private Flight flight;
    private Runway runway;
    public boolean land;

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean isLandingOk() {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        land = status;
    }
}
