package com.vikky.lecture29;

/**
 * Class Horse extends Animal class and overrides 2 methods eat() and sleep().
 * It also has getPrice() and addRider(String) methods.
 *
 * @author Udayan Khattry
 */


public class Horse extends Animal implements Sellable, Ridable {
    @Override
    public void eat() {
        System.out.println("Horse eats hay");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeps standing up");
    }

    @Override
    public double getPrice() {
        return 150000;
    }

    @Override
    public void addRider(String name) {
        System.out.println(name + " is riding a horse.");
    }
}
