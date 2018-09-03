package com.vikky.lecture29;

// if you delete the getPrice method... it will give you an error to either add the method or create an abstract class - which you don't want to add it as an abstract class
public class Camel extends Animal implements Sellable, Ridable {
    @Override
    public void eat() {
        System.out.println("Camel eats plants");
    }

    @Override
    public void sleep() {
        System.out.println("Camel sleeps by laying down on stomach");
    }

    @Override
    public double getPrice() {
        return 200000;
    }

    @Override
    public void addRider(String name) {
        System.out.println(name + " is riding a camel.");
    }
}
