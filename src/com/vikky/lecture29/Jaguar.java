package com.vikky.lecture29;

/**
 * Class Jaguar extends Animal class and overrides 2 methods eat() and sleep().
 *
 * @author Udayan Khattry
 */

public class Jaguar extends Animal {
    @Override
    public void eat() {
        System.out.println("Jaguar eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Jaguar sleeps in trees");
    }
}
