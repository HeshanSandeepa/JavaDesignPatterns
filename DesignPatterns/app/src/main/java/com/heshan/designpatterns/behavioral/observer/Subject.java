package com.heshan.designpatterns.behavioral.observer;

// Implemented by Cricket data to communicate
// with observers

public interface Subject {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers();
}
