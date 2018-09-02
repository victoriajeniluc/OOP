package com.vikky.lecture18;
/**
 * Effects of INHERITANCE on constructors and initialization blocks.
 *
 * @author Udayan Khattry
 */


public class B3 extends A3 {

    public B3() { //no-arg constructor
        super(); //parent class's no-arg constructor is invoked
        System.out.println("no-arg constructor of B");
    }

    static { //static initialization block
        System.out.println("static initialization block of B");
    }

    { //instance initialization block
        System.out.println("instance initialization block of B");
    }

}
