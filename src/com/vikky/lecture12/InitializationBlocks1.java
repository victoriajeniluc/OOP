package com.vikky.lecture12;

import java.security.SecureRandom;

public class InitializationBlocks1 {
    // 3. Anothr way of initializing an instance variable is when declaration happens.
    public int x = 100; // but you have to do it like this.. you can't have it on another line at all because there will be a compliation error. this area is mostly for class/ static variables and instance variables... if you have any crazy logic, please put it in the constructor block
    public static int y;

    // 1. This is one way of initializing an instance variable
    public InitializationBlocks1() {
        //TEST 1: this is perfectly legal where you have some crazy logic of x.

        SecureRandom random = new SecureRandom();
        int temp  = random.nextInt(10);
        x = temp;

        // TEST 2: we can do the crazy logic with the class variable for y like how we did for x... but there's a problem of doing this.
        // PROBLEM: statc variables can be initialized / modified in the constructors / methods, one such case is finding out the number of instances of any class created in the memory. But in this case, I want to initialize the static variable only once and constructor isn't great to use in this case.... in this case, there is initialization blocks!
        y = temp;
    }

    // 2. Another way of initializing an instance variable
    public InitializationBlocks1(int x) {
        this.x = x;
    }

    // static initialization block: where when it is invoked only once class template is loaded in the memory
    static {
        SecureRandom random = new SecureRandom();
        int temp  = random.nextInt(10);
        y = temp;
    }

    // instance initialization block: is executed everytime a new keyword is used for instance of a class to be created
    {
        x = 50;
    }
}
