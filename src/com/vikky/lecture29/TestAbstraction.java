package com.vikky.lecture29;

/**
 * This class was used to discuss abstract keyword. We covered following points:
 * 1. A class in Java can be declared abstract even if it doesn't have even a single abstract method.
 * 2. If a class has even one abstract method, then class must be abstract.
 * 3. Constructor of an abstract class cannot be invoked using new keyword but it is invoked by using super().
 * 4. If a subclass doesn't implement/override abstract method of superclass, then it must be declared as abstract.
 * 5. Implementing method must follow all the overriding rules.
 * 6. A method cannot be declared both: private & abstract, final & abstract and static & abstract.
 *
 * For more details check Video Lecture No. 19 of Section 9.
 *
 * @author Udayan Khattry
 */


 abstract class A extends Object {
    public A() {
        super();
    }

    /*public void m1() {
        System.out.println("A: m1");
    }*/
   public abstract void m1();
}

// only inherits m1
// class B will only turn red if we change the class A to abstract because B is inheriting from class A.. so it also needs to be abstract
 abstract class B extends A {
    public B() {
        super();
    }
}

// overwrites m1
class C extends B {
    public C() {
        super();
    }

    // THIS HAS TO BE PUBLIC BECAUSE IT WAS OVERRIDED WITH CLASS B AND A ... IF IT CHANGES TO PROTECTED OR ANYTHING ELSE ... IT WILL GIVE AN ERROR
    public void m1() {
        System.out.println("C: m1");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        //A [] arr = new A[5]; The reason why we are get a compliation error for this because we are talking about the creation of a new array of A.. not the reference object. Since that the primitive array is not part of this chain or invokes the A constructor... it doens't give us an error
        A a1 = new C(); // A a1 = new A(); when we do this... it is invoking the A constructor and creating a new instance variable of A  - also the class is abstract so this is not allowed
        a1.m1();
    }
}