package com.vikky.lecture18.test;

/**
 * Class to test constructor chaining of classes A and B.
 *
 * @author Udayan Khattry
 */


import com.vikky.lecture18.B2;

public class TestA2B2 {

    public static void main(String[] args) {
        B2 b2 = new B2(); //Creates an object of B2 class in the HEAP memory.... it will print out parameterized constructor of A

        b2.setI(5);
        System.out.println("this is the value of b2 now:" + b2.getI());     // OUTPUT:
        // In parameterized constructor of A - from class A
        // this is the value of b2 now: 5 - from using the methods from class A
    }
}