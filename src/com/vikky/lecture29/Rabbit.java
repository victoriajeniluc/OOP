package com.vikky.lecture29;

/**
 * Class Rabbit extends Animal class and overrides 2 methods eat() and sleep().
 * It also has getPrice() method.
 *
 * @author Udayan Khattry
 */

public class Rabbit extends Animal implements Sellable {
    @Override
    public void eat() {
        System.out.println("Rabbit eats carrots");
    }

    @Override
    public void sleep() {
        System.out.println("Rabbit sleeps underground in burrow");
    }

    @Override
    public double getPrice() {
        return 5000;
    }
}

