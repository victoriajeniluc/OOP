package com.vikky.lecture29;

// I1 is a functional interface

// only allows public as the access specifier
@FunctionalInterface // once this is added.. you can no longer add other abstract methods to this

public interface I1 { // can be written as: public abstract interface I1

    int i = 100; // interfaces can have variables
    void m1(); // can be written as public abstract void m1();
}
