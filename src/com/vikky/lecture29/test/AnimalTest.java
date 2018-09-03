package com.vikky.lecture29.test;

/**
 * This is a test class to check eat(), sleep(), getPrice() and addRider(String) methods of
 * animal instances.
 *
 * @author Udayan Khattry
 */

import com.vikky.lecture29.*;

public class AnimalTest {
    private static void checkAnimals(Animal animal) {
        // TEST1: checking how the animal eats and sleeps:
        animal.eat();
        animal.sleep();

        // TEST2: invoking the other methods in Horse and Rabbit... the only issue is that the Animal class only has eat and sleep... it doesn't have any other methods
        // Solution: customized condition to invoke those methods:
        /*if(animal instanceof Horse) {
            Horse horse = (Horse) animal;
            System.out.println("This is the price of a horse:" + horse.getPrice());
            horse.addRider("Jack");
        } else if(animal instanceof Rabbit) {
            Rabbit rabbit = (Rabbit) animal;
            System.out.println(" This is the price of a rabbit:" + rabbit.getPrice());
        } else if(animal instanceof  Camel) { // What i did to solve the problem in Test 3
            Camel camel = (Camel) animal;
            System.out.println("This is the price fo the camel: " + camel.getPrice());
            camel.addRider("Joe");
        }*/

        // TEST 3: is the way we wrote our checkAnimals method a good way of doing it??
        // -- ADD A NEW ANIMAL TO TEST IT OUT: Camel
        // Problem: is that if we add the camel to this equation.. we would have to add a new condition for the camel to invoke its methods.
            // SO EVERYTIME AN ANIMAL IS ADDED... THIS MAY HAPPEN... THAT WILL BE ALOT OF CODE AND CONSTANTLY ADDING .... THIS DEFEATS THE PURPOSE OF POLYMORPHISM (THIS IS NOT GOOD... SO DEFINITELY COMMENT IT OUT)
      // SOLUTION: INTERFACES!

        if(animal instanceof Sellable) {
            Sellable obj = (Sellable) animal;
            System.out.println(obj.getPrice());
        }

        if(animal instanceof Ridable) {
            Ridable obj = (Ridable) animal;
            obj.addRider("Jack");
        }
    }

    public static void main(String[] args) {
        // NOTE: IT IS ADVISABLE TO USE A SUPERCLASS REFERENCE - ANIMAL NOT OBJECT -  REFERRED TO AS A CLASS INSTANCE TO CHECK... SO YOU DONT HAVE TO CHANGE THE CHECKANIMALS METHOD

        // TEST1 checking how the animal eats and sleeps.. in this case:
        // The methods eat and sleep will be invoked defined by the horse
        Animal obj = new Horse();
        checkAnimals(obj);

        System.out.println("--------------------------");

        // TEST1 checking how the animal eats and sleeps.. in this case it will be the rabbit
        Animal obj2 = new Rabbit();
        checkAnimals(obj2);

        System.out.println("--------------------------");

        // TEST1 checking how the animal eats and sleeps.. in this case it will be the rabbit
        Animal obj3 = new Jaguar();
        checkAnimals(obj3);


        System.out.println("--------------------------");

        // TEST3 checking how the animal eats and sleeps.. in this case it will be the camel... using this to test if the way we wrote our checkAnimals method is a great one
        Animal obj4 = new Camel();
        checkAnimals(obj4);

    }
}
