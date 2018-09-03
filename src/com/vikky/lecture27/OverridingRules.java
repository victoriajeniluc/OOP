package com.vikky.lecture27;

/**
 * This example was used to explain following overriding rules.
 * 1. The parent class method must be accessible in child class to be overridden. private method cannot be overridden.
 * 2. The argument list in overriding method must exactly match that of the overridden method.
 * 3. If parent class method returns primitive type, then return type must be same in overriding method.
 *    If parent class method returns reference type, then overriding method must return either same type or a subtype.
 * 4. Access modifier in overriding method cannot be more restrictive.
 *
 * Watch Video lecture no. 15 of Section 9 for details.
 *
 * @author Udayan Khattry
 */

class Super {
    protected int m1(Object s1) {
        return 2;
    }

    public Object m2() {
        //This method should return Object type but we are returning String instance, which is same as polymorphic behavior.
        //parent class reference can easily refer to any instance of child class
        //String extends Object hence following statement is correct:
        //Object obj = "Super";
        return "Super";
    }
}

class Sub extends Super {
    protected int m1(Object s1) {
        return 3;
    }
    // if this returns a string type than an object type.. that is perfectly fine because string is a sub class of the object
    public Object m2() {
        return "Sub";
    }
}

public class OverridingRules {
    public static void main(String[] args) {
        // if this was set on private.. it will give an error because the accessibility of obj. The compiler won't know it is private until it is ran... but it won't be able to get through it if the outer shell is private - not being able to access
        Super obj = new Sub();
        int i1 = obj.m1("test");
    }
}
