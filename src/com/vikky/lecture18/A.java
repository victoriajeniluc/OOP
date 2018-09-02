package com.vikky.lecture18;
/**
 * Constructors and Inheritance.
 *
 * @author Udayan Khattry
 */


public class A {
    private int i; //private instance variable

    public A() { //no-arg constructor
        System.out.println("In no-arg constructor of A");
    }

    public int getI() { //getter
        return i;
    }

    public void setI(int i) { //setter
        this.i = i;
    }

}
