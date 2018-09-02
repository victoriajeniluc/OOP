package com.vikky.lecture18;

/**
 * Constructors in case of INHERITANCE.
 *
 * @author Udayan Khattry
 */


public class A2 {
    private int i; //private instance variable

    public A2(int i) { //parameterized constructor
        System.out.println("In parameterized constructor of A");
        this.i = i;
    }

    public int getI() { //getter
        return i;
    }

    public void setI(int i) { //setter
        this.i = i;
    }

}