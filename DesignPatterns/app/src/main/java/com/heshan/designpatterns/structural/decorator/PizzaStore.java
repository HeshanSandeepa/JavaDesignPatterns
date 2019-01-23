//https://www.geeksforgeeks.org/decorator-pattern/

/*
Decorator pattern allows a user to add new functionality to an existing object without altering
its structure. This type of design pattern comes under structural pattern as this pattern acts as a
wrapper to existing class.

Pros:
01. Decorators provide a flexible alternative to subclassing for extending functionality
02. Decorators allow behavior modification at runtime rather than going back into existing code and making changes
03. Decorators are a nice solution to permutation issues because you can wrap a component with any number of decorators
04. The decorator pattern supports the principle that classes should be open for extension but closed for modification

Cons:

01. Decorators can result in many small objects in our design, and overuse can be complex
02. Decorators can cause issues if the client relies heavily on the components concrete type
03. Decorators can complicate the process of instantiating the component because you not only have
to instantiate the component but wrap it in a number of decorators
04. It can be complicated to have decorators keep track of other decorators because to look back
into multiple layers of the decorator chain starts to push the decorator pattern beyond its true intent

*/

package com.heshan.designpatterns.structural.decorator;

public class PizzaStore {

    public void test() {
        // create new margherita pizza
        Pizza pizza = new FarmHouse();
        System.out.println( pizza.getDescription() +
                " Cost :" + pizza.getCost());

        // create new FarmHouse pizza
        Pizza pizza2 = new FarmHouse();

        // decorate it with freshtomato topping
        pizza2 = new FreshTomato(pizza2);

        //decorate it with Barbeque topping
        pizza2 = new Barbeque(pizza2);

        System.out.println( pizza2.getDescription() +
                " Cost :" + pizza2.getCost());
        Pizza pizza3 = new Barbeque(null);    //no specific pizza
        System.out.println( pizza3.getDescription() + "  Cost :" + pizza3.getCost());
    }
}

