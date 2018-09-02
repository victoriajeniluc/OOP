
/**
 * Example of INHERITANCE.
 * Class "B" is the Child / Sub / Derived class.
 *
 * @author Udayan Khattry
 */
package com.vikky.lecture16;

public class B extends A {

    // creating a property for B
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // CASE 1: when B decides to use the same method name as class A
    // SOLUTION: override annotation

    @Override // only works when the method name is the same in the super class ... otherwise there will be an error
            // only issue is that we won't be able to set the value for the method setValue that was inherited from class A
    public void setValue(int value) { //public setterawkwardmomentbetweenaandb
        System.out.println("hello");
        super.setValue(value); // this will help enhance the abilities of setValue
    }
        // WHAT HAPPENS IS THAT IT WILL RUN THE METHOD UNDER CLASS B FIRST THEN IT WILL RUN THE METHOD IN CLASS A... but the value wouldn't be the value that you set it to.
}