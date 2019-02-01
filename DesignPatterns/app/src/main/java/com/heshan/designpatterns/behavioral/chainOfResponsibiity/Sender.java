/*

The intent of the Chain of Responsibility design pattern is to:

Avoid coupling the sender of a request to its receiver by giving more than one
object a chance to handle the request. Chain the receiving objects and pass the
request along the chain until an object handles it." [GoF]

See Problem and Solution sections for a more structured description of the intent.
        • The Chain of Responsibility design pattern solves problems like:
        – How can coupling the sender of a request to its receiver be avoided?
        – How can more than one object handle a request?

        • A request is an operation that one object (sender) performs on another (receiver).
        • An inflexible way is to implement a request directly within the class that sends the request.
        This couples the sender of a request to a particular receiver at compile-time.

        • The Chain of Responsibility pattern describes how to solve such problems:
        – Chain the receiving objects and pass the request along the chain until an object handles it.
        – Define and chain Handler objects that either handle or forward a request.
This results in a chain of objects having the responsibility to handle a request.


Advantages (+)
• Decouples sender from receiver.
– The pattern decouples the sender of a request from a particular receiver (handler) by sending
the request to a chain of handlers.
• Makes changing the chain of handlers easy.
– The chain of handlers can be changed at run-time (handlers can be added to and removed
from the chain).

Disadvantages (–)
• Successor chain can be complex.
– If there is no existing object structure that can be used to define and maintain a successor
chain, it may be hard to implement and maintain the chain (see Implementation).
– "Chain of Responsibility is a good way to decouple the sender and the receiver if the chain
is already part of the system's structure, and one of several objects may be in a position to
handle the request."


*/



package com.heshan.designpatterns.behavioral.chainOfResponsibiity;

public class Sender {

    public void test() {
        // Creating the chain of handler objects.
        Handler handler = new Receiver1(new Receiver2(new Receiver3()));
        //
        System.out.println("Issuing a request to a handler object");
        handler.handleRequest();
    }
}
