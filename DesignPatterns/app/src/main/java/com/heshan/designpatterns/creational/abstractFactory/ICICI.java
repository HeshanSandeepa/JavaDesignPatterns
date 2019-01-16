package com.heshan.designpatterns.creational.abstractFactory;

public class ICICI implements Bank {

    private final String BNAME;
    ICICI(){
        BNAME = "ICICI BANK";
    }

    @Override
    public String getBankName() {
        return null;
    }
}
