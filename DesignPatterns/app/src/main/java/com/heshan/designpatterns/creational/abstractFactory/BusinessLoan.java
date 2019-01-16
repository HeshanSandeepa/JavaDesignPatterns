package com.heshan.designpatterns.creational.abstractFactory;

public class BusinessLoan extends Loan {

    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
