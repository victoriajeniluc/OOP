package com.vikky.lecture17.test;

/**
 * Class to test the behaviors of classes Base and Derived.
 *
 * As Derived extends Base, hence Derived class can be used to access the static members of Base class.
 * But the syntax of using child class's name to access parent class's static members should be avoided as it creates confusion.
 *
 * @author Udayan Khattry
 */

import com.vikky.lecture17.Base;
import com.vikky.lecture17.Derived;

public class TestBaseDerived {
    public static void main(String[] args) {
        System.out.println(Base.n); //static variable n defined in Base class.
        Base.greet(); //static method greet() defined in Base class.

        //Case 1: When Derived class has not defined variable n and greet() method, then Base.n == Derived.n and Base.greet() == Derived.greet().
        //Case 2: When Derived class has defined variable n and greet() method, then Base.n != Derived.n and Base.greet() != Derived.greet().
        System.out.println(Derived.n);
        Derived.greet();
    }
}
