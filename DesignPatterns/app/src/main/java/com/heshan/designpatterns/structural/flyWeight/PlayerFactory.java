/*

Flyweight Design Pattern

Flyweight pattern is one of the structural design patterns as this pattern provides ways to
decrease object count thus improving application required objects structure. Flyweight
pattern is used when we need to create a large number of similar objects (say 105).
One important feature of flyweight objects is that they are immutable. This means that they
cannot be modified once they have been constructed.

Why do we care for number of objects in our program?

1. Less number of objects reduces the memory usage, and it manages to keep us away from errors
   related to memory like java.lang.OutOfMemoryError.
2. Although creating an object in Java is really fast, we can still reduce the execution time
   of our program by sharing objects.

In Flyweight pattern we use a HashMap that stores reference to the object which have already
been created, every object is associated with a key. Now when a client wants to create
an object, he simply has to pass a key associated with it and if the object has already been
created we simply get the reference to that object else it creates a new object and then
returns it reference to the client.

*/


package com.heshan.designpatterns.structural.flyWeight;

// Claass used to get a playeer using HashMap (Returns
// an existing player if a player of given type exists.
// Else creates a new player and returns it.

import java.util.HashMap;

public class PlayerFactory {

    /* HashMap stores the reference to the object
     of Terrorist(TS) or CounterTerrorist(CT).  */
    private static HashMap <String, Player> hm =  new HashMap<String, Player>();

    public static Player getPlayer(String type) {
        Player p = null;

        /* If an object for TS or CT has already been
           created simply return its reference */
        if (hm.containsKey(type)) {
            p = hm.get(type);
        } else {
            /* create an object of TS/CT  */
            switch(type) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    p = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    p = new CounterTerrorist();
                    break;
                default :
                    System.out.println("Unreachable code!");
            }

            // Once created insert it into the HashMap
            hm.put(type, p);
        }
        return p;
    }
}
