/*
Singleton Pattern says that just"define a class that has only one instance and provides a global
point of access to it".

In other words, a class must ensure that only single instance should be created and single object
can be used by all other classes.


Advantage of Singleton design pattern
1. Saves memory because object is not created at each request. Only single instance is reused again
and again.


Usage of Singleton design pattern
1. Singleton pattern is mostly used in multi-threaded and database applications.
It is used in logging, caching, thread pools, configuration settings etc.


*/

package com.heshan.designpatterns.creational.singleton;

public class Helper {

    private static Helper helper;

    private Helper() {
    }

    public static Helper getHelper() {
        if (helper == null) {
            synchronized (Helper.class) {
                if (helper == null) {
                    helper = new Helper();
                }
            }
        }
        return helper;
    }

    public void doHelper() {
    }
}
