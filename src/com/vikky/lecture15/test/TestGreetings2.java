package com.vikky.lecture15.test;

/**
 * Class to test the visibility of the members of com.udayan.lec02_2.Greetings class.
 *
 * @author Udayan Khattry
 */

import com.vikky.lecture15.Greetings;


public class TestGreetings2 {
    // note: if it is a default accessor for the Greetings class... TestGreetings2 will have many warnings since default accessor isn't able to provide access to files that are not in the same package
    public static void main(String[] args) {
        /*
         * Below 3 statements are accessible only for public access specifier.
         */
        Greetings g = new Greetings("Good Morning!"); //Calling the constructor

        System.out.println(g.msg); //Accessing instance variable

        Greetings.sayHello(); //Invoking method
    }
}

