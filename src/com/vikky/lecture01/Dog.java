package com.vikky.lecture01;

public class Dog {
    public String name;
    public int age;
    public String color;
    public String breed;

    public void bark() {
        System.out.println(name + " is barking");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void wagTail() {
        System.out.println(name + " is wagging tail");
    }

    // IT IS SMART TO SEPARATE THE TEST CODE AND THE DOG CLASS TO KEEP IT ORGANIZED AND CLEAN..... SO CREATE A NEW FILE -> DOGTEST1
    /*public static void main(String[] args) {
        Dog dog1 = new Dog(); // creates a dog object and assigns its address to the dog when reference variable
        dog1.name = "Bubbly"; // this is how to write the value to the properties
        dog1.age = 10;// this is how to write the value to the properties
        dog1.breed = "Poodle";// this is how to write the value to the properties
        dog1.color = "white";// this is how to set the value to the properties

        System.out.println(dog1.name + " : " + dog1.age + " : " + dog1.breed + " : " + dog1.color); // OUTPUT: Bubbly : 10 : Poodle : white

        dog1.bark();// OUTPUT: Bubbly is barking
        dog1.eat(); //Bubbly is eating
        dog1.wagTail();//Bubbly is wagging tails
    }*/
}
