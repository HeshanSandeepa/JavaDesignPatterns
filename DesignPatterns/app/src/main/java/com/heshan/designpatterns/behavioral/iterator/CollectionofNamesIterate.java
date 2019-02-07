package com.heshan.designpatterns.behavioral.iterator;

public class CollectionofNamesIterate implements Iterator {

    int i;
    String[] names;

    public CollectionofNamesIterate(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        if (i < names.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return names[i++];
        }
        return null;
    }
}
