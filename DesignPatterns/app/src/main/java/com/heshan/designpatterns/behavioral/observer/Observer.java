/*

Observer Design Pattern

01. Define a one-to-many dependency between objects so that when one object changes state, all
    its dependents are notified and updated automatically.

02. Encapsulate the core (or common or engine) components in a Subject abstraction, and the
    variable (or optional or user interface) components in an Observer hierarchy.


Advantages:

Provides a loosely coupled design between objects that interact. Loosely coupled objects are flexible
with changing requirements. Here loose coupling means that the interacting objects should have less
information about each other.

Observer pattern provides this loose coupling as:

Subject only knows that observer implement Observer interface.Nothing more.
There is no need to modify Subject to add or remove observers.

We can reuse subject and observer classes independently of each other.

Disadvantages:

Memory leaks caused by Lapsed listener problem because of explicit register and unregistering of
observers.

When to use this pattern?
You should consider using this pattern in your application when multiple objects are dependent on
the state of one object as it provides a neat and well tested design for the same.

Real Life Uses:

It is heavily used in GUI toolkits and event listener. In java the button(subject) and
onClickListener(observer) are modelled with observer pattern.
Social media, RSS feeds, email subscription in which you have the option to follow or subscribe and
you receive latest notification.
All users of an app on play store gets notified if there is an update.

*/


package com.heshan.designpatterns.behavioral.observer;

// This interface is implemented by all those
// classes that are to be updated whenever there
// is an update from CricketData

public interface Observer {
    public void update(int runs, int wickets,
                       float overs);
}
