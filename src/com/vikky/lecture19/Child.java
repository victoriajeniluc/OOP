package com.vikky.lecture19;

/**
 * Example to show multilevel inheritance.
 * Class Child extends from Parent class.
 *
 * @author Udayan Khattry
*/

public class Child extends Parent {
    public void m2(){
        System.out.println("In Child:m2()");
    }

    //Class Child inherits all the visible methods of Parent class
    //Class Child inherits all the visible methods of Object class as well (as Parent extends Object)
}
