package com.heshan.designpatterns.behavioral.state;

//Provides implementation for methods defined in State.
public class Vibration implements MobileAlertState {

    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("vibration...");
    }
}
