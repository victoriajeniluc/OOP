package com.vikky.lecture17;
/**
 * Example of INHERITANCE: hiding static fields and methods of parent class.
 *
 * @author Udayan Khattry
 */


public class Base {
    public static String n = "Core Java"; //static variable n

    public static void greet() { //static method greet()
        System.out.println("Good Morning");
    }
}
