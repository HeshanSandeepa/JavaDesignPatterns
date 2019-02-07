/*
Iterator Pattern is used "to access the elements of an aggregate object sequentially without
exposing its underlying implementation".

The Iterator pattern is also known as Cursor.


Advantage of Iterator Pattern
1. It supports variations in the traversal of a collection.
2. It simplifies the interface to the collection.

Usage of Iterator Pattern:
1. When you want to access a collection of objects without exposing its internal representation.
2. When there are multiple traversals of objects need to be supported in the collection.

*/


package com.heshan.designpatterns.behavioral.iterator;

public interface Iterator {
    boolean hasNext();
    Object next();
}
