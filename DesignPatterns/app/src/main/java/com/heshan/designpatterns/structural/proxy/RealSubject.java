package com.heshan.designpatterns.structural.proxy;

public class RealSubject extends Subject {
    @Override
    public String operation() {
        return "RealSubject";
    }
}
