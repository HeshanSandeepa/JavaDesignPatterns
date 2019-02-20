/*

State Pattern

A State Pattern says that "the class behavior changes based on its state". In State Pattern,
we create objects which represent various states and a context object whose behavior varies as its
state object changes.
The State Pattern is also known as Objects for States

Usage : 3-speed ceiling fan state machine

1. When the behavior of object depends on its state and it must be able to change its behavior at
runtime according to the new state.

2. It is used when the operations have large, multipart conditional statements that depend on the
state of an object.


Advantages of State Design Pattern

1. With State pattern, the benefits of implementing polymorphic behavior are evident, and it is also
easier to add states to support additional behavior.

2. In the State design pattern, an object’s behavior is the result of the function of its state, and
the behavior gets changed at runtime depending on the state. This removes the dependency on the
if/else or switch/case conditional logic. For example, in the TV remote scenario, we could have also
implemented the behavior by simply writing one class and method that will ask for a parameter and
perform an action (switch the TV on/off) with an if/else block.

3. The State design pattern also improves Cohesion since state-specific behaviors are aggregated into
the ConcreteState classes, which are placed in one location in the code.

Disadvantages of State Design Pattern

1. The State design pattern can be used when we need to change state of object at runtime by inputting
in it different subclasses of some State base class. This circumstance is advantage and disadvantage
in the same time, because we have a clear separate State classes with some logic and from the other
hand the number of classes grows up.

*/



package com.heshan.designpatterns.behavioral.state;

//Defines interface for declaring what each concrete state should do.
public interface MobileAlertState {
    public void alert(AlertStateContext ctx);
}
