package com.vikky.lecture18;
/**
 * Effects of INHERITANCE on constructors and initialization blocks.
 *
 * @author Udayan Khattry
 */


public class A3 {

    public A3() { //no-arg constructor
        System.out.println("no-arg constructor of A");
    }

    static { //static initialization block
        System.out.println("static initialization block of A");
    }

    { //instance initialization block
        System.out.println("instance initialization block of A");
    }

}
