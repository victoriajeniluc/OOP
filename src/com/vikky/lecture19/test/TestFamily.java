package com.vikky.lecture19.test;

/**
 * Test class to show that object of SubChild class has access to following:
 * 1. Visible methods of SubChild Class
 * 2. Visible methods of Child Class (immediate parent)
 * 3. Visible methods of Parent Class (grandparent)
 * 4. Visible methods of Object Class (Great grandparent)
 *
 * @author Udayan Khattry
 */


import com.vikky.lecture19.SubChild;
import com.vikky.lecture19.Child2;

public class TestFamily {
    public static void main(String[] args) {
        SubChild obj = new SubChild();

        //Reference variable of SubChild class is used to access below methods:
        obj.m3(); //Method of SubChild class
        obj.m2(); //Method of Child class
        obj.m1(); //Method of Parent class
        obj.toString(); //Method of Object class

        System.out.println("---------------------");
        Child2 secondChild = new Child2();
        secondChild.m1(); //Method of Child class where it overrides the parent m1
        secondChild.toString(); //Method of Object class

    }
}
