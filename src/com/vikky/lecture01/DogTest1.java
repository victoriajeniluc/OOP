/**
 * CREATE AN EXAMPLE THAT WILL SHOW THE OBJECT CREATION LOGIC
 * BY SEPARATING THE TEST CODE AND THE CODE CLASS
 *
 * @author Udayan Khattry
 */

package com.vikky.lecture01;

public class DogTest1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // creates a dog object and assigns its address to the dog when reference variable
        dog1.name = "Bubbly"; // this is how to write the value to the properties
        dog1.age = 10;// this is how to write the value to the properties
        dog1.breed = "Poodle";// this is how to write the value to the properties
        dog1.color = "white";// this is how to set the value to the properties

        System.out.println(dog1.name + " : " + dog1.age + " : " + dog1.breed + " : " + dog1.color); // OUTPUT: Bubbly : 10 : Poodle : white

        dog1.bark();// OUTPUT: Bubbly is barking
        dog1.eat(); //Bubbly is eating
        dog1.wagTail();//Bubbly is wagging tails

        System.out.println("--------------------------------------------");

        // Create an example of looping through all the dog objects and printing out the properties and methods!
        Dog dog2 = new Dog();
        dog2.name = "Rusty";
        dog2.age = 5;
        dog2.breed = "Poodle";
        dog2.color = "white";

        Dog dog3 = new Dog();
        dog3.name = "Hunter";
        dog3.age = 2;
        dog3.breed = "German Shepard";
        dog3.color = "Golden black";

        Dog dog4 = new Dog();
        dog4.name = "Vikky";
        dog4.age = 3;
        dog4.breed = "Husky";
        dog4.color = "Silver white";

        Dog [] array = {dog2, dog3, dog4};

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i].name + " : " + array[i].breed + " : " + array[i].color + " : " + array[i].age);
            array[i].bark();
            array[i].wagTail();
            array[i].eat();
        }

    }
}
