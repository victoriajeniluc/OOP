package com.vikky.lecture15;

/**
 * Class to test the visibility of the members of com.udayan.lec02_2.Greetings class.
 *
 * @author Udayan Khattry
 */


public class TestGreetings {
    public static void main(String[] args) {
        /*
         * Below 3 statements are accessible for public and default access specifiers.
         */
        Greetings g = new Greetings("Hello"); //Calling the constructor

        System.out.println(g.msg); //Accessing instance variable

        Greetings.sayHello(); //Invoking method
    }
}

