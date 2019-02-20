package com.heshan.designpatterns.behavioral.state;

//Defines an interface to client to interact. It maintains references to concrete state object which
// may be used to define current state of object.

public class AlertStateContext {

    private MobileAlertState currentState;

    public AlertStateContext() {
        currentState = new Vibration();
    }

    public void setState(MobileAlertState state) {
        currentState = state;
    }

    public void alert() {
        currentState.alert(this);
    }
}
