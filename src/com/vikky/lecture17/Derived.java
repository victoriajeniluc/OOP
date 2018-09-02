package com.vikky.lecture17;
/**
 * Class Derived hides the static variable n and greet() method of Base class.
 *
 * @author Udayan Khattry
 */


public class Derived extends Base{
    public static int n = 100; //static variable n

    public static void greet() { //static method greet()
        System.out.println("Good Evening");
    }
}
