package com.vikky.lecture29;
/**
 * Animal is an abstract class with two abstract methods eat() and sleep().
 *
 *
 * SELLABLE AND RIDABLE ARE INTERFANCES
 * RABBIT, HORSE, CAMEL, AND JAGUAR ARE CONCRETE CLASSES
 * @author Udayan Khattry
 */


public abstract class Animal {
    public abstract void eat();
    public abstract void sleep();

    // TEST 2 - how to pull specific methods from the horse class and the rabbit class...
    // DO NOT ADD ABSTRACT METHODS FOR SPECIFICALLY FOR RABBIT OR HORSE BECAUSE IT IS NOT INHERITABLE IN OTHER CLASSES... like jaguar doesn't have getPrice method like rabbit and horse... rabbit/ jaguar doesn't have the ridden method... so it won't be smart to do that.

}
