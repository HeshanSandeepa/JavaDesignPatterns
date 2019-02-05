/*
The command pattern encapsulates a request as an object, thereby letting us parameterize other
objects with different requests, queue or log requests, and support undoable operations.


Advantages:
1. Makes our code extensible as we can add new commands without changing existing code.
2. Reduces coupling the invoker and receiver of a command.

Disadvantages:
1. Increase in the number of classes for each individual command.



*/


package com.heshan.designpatterns.behavioral.command;

public interface Command {
    public void execute();
}
