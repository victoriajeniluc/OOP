/**
 * Example to show shadowing of instance variable by local variable and how to access instance variable
 * in such cases.
 *
 * @author Udayan Khattry
 */

// Main method is on top of the stack and the parameter variable args is accessible

// STEP OVER - another local variable ctr comes into existence and it refers to an object and the value of count variable of this object is zero. All instance variables are assigned with their respective default values ... so count is assigned to 0. Then print method is invoked on ctr reference...

// STEP INTO - print method gets pushed ontop of the stack  as count as an instance variable.. hence it is accessed using this reference(previous note)

// STEP OVER - the current value of variable count is printed onto the console.

// STEP OVER - another variable with the same name comes into existence and 500 is assigned to it. - count = 500 is shadowing the instance variable count... so it cant reference to the variable count anymore.. you would have to use THIS.COUNT to reference to the object

// STEP OVER - the increment method is invoked onto the ctr reference.

// STEP INTO - the increment method is pushed onto of the stack.

// STEP OVER - instance variable count is accessed using the reference which is where count is equal to 1.

// STEP OVER - control goes back to the main method and prints out the after increment statement with the reference of the ctr.count property.

// STEP OVER - setCounter is invoked onto the ctr object and it is pushed on top of the stack. c is local.

// STEP OVER - the instance variable gets updated with the new count

// STEP OVER - control goes back into the main method and prints out the after setCounter statement with the reference of the ctr.count property


package com.vikky.lecture11;
public class Counter {
    public int count; //instance variable

    public void increment() {
        count = count + 1; //instance variable is accessed using short hand notation.
        // Compiler adds this and dot operator over here as there is no conflict with local variable.
    }

    public void setCounter(int count) { //local variable count shadows instance variable
        this.count = count; //Full name (this.count) refers to instance variable and short hand (name) refers to local variable - which was 1 from the after increment in line 35..... the local variable count is shadowed by the instance variable count.. its not use. you have to use this to retain the value of the property count of the instance variable.
    }

    public void print() {
        System.out.println(count); //instance variable is accessed using short hand notation.
        System.out.println(this.count); //instance variable is accessed using this reference.
        int count = 500; //local variable count shadows instance variable count
        System.out.println(count); //Short hand notation points to local variable and as local variable name conflicts with instance variable name,
        //compiler doesn't add this and dot operator over here.
        System.out.println(this.count); //instance variable is accessed using full name
    }

    public static void main(String [] args) {
        Counter ctr = new Counter();
        ctr.print();

        ctr.increment();
        System.out.println("After increment: " + ctr.count);

        ctr.setCounter(11);
        System.out.println("After setCounter: " + ctr.count);

    }
}
