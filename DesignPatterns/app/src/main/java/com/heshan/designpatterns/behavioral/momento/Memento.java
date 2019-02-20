/*

Memento Design Pattern

Intent
Without violating encapsulation, capture and externalize an object's internal state so that the
object can be returned to this state later.

Problem
Need to restore an object back to its previous state (e.g. "undo" or "rollback" operations).

The Memento design pattern defines three distinct roles:

Originator - the object that knows how to save itself.
Caretaker - the object that knows why and when the Originator needs to save and restore itself.
Memento - the lock box that is written and read by the Originator, and shepherded by the Caretaker.

*/

package com.heshan.designpatterns.behavioral.momento;

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
