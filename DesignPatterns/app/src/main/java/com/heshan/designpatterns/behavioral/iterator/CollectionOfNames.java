package com.heshan.designpatterns.behavioral.iterator;

public class CollectionOfNames implements Container {

    public String name[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"};

    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate(name) ;
    }
}
