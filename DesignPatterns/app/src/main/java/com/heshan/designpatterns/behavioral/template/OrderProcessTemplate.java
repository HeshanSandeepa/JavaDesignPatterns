/*

Template Pattern
A Template Pattern says that "just define the skeleton of a function in an operation, deferring some
steps to its subclasses".

Benefits:
1. It is very common technique for reusing the code.This is only the main benefit of it.

Usage:
2. It is used when the common behavior among sub-classes should be moved to a single common class by
avoiding the duplication.

*/


package com.heshan.designpatterns.behavioral.template;

public abstract class OrderProcessTemplate {

    public boolean isGift;
    public abstract void doSelect();
    public abstract void doPayment();

    public final void giftWrap() {
        try {
            System.out.println("Gift wrap successfull");
        } catch (Exception e) {
            System.out.println("Gift wrap unsuccessful");
        }
    }

    public abstract void doDelivery();
    //template method
    public final void processOrder(boolean isGift) {
        doSelect();
        doPayment();
        if (isGift) {
            giftWrap();
        }
        doDelivery();
    }
}
