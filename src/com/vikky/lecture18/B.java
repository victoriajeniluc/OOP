package com.vikky.lecture18;

/**
 * Constructors and Inheritance.
 *
 * @author Udayan Khattry
 */


public class B extends A {

    //If there are no constructors available, Java compiler adds following default constructor
	/*public B() {
		super(); //Calling no-arg constructor of parent class.
	}*/

    //no-arg constructor
    public B() {
        super(); //If super(); is not available then Java compiler adds this call.
        System.out.println("In no-arg constructor of B");
    }
}
