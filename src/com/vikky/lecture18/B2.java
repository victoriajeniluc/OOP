package com.vikky.lecture18;

/**
 * Constructors in case of INHERITANCE.
 *
 * @author Udayan Khattry
 */

public class B2 extends A2 {
    //Default constructor added by Java compiler
	/*public B() {
		super(); //calling Parent class's no-arg constructor, which is not available. Hence, compilation error.
	}*/

    //no-arg constructor
    public B2() {
        super(-1); //Calling Parent class's parameterized constructor, which is available.
    }

}