package com.vikky.lecture20.test;
/**
 * Test class.
 *
 * @author Udayan Khattry
 */


import com.vikky.lecture20.Sub;

public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.m1(); //Calls the inherited method m1() of Super class
        sub.m2(); //Calls the overridden method m2() of Sub class
    }
}
