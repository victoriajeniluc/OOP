/**
 * This lecture is showing how we can implement class variables because ... when we just create a instant variable for University... it can be a hand full of creating space for 10000 people with the same variable... maybe we can create a CLASS VARIABLE so the students can all access it or reference to it
 *
 * look at the picture lecture8variables1.png
 */
package com.vikky.lecture09;

public class Student {
    public String fName;
    public String lName;
    public int age;
    // static class variable
    public static String univ = "Standford University";

    public Student(String firstName, String lastName, int studAge) {
        fName = firstName;
        lName = lastName;
        age = studAge;
    }

    public void printDetails() {
        // name is a local variable because it is not a property of the Student object
        String name = lName + ", " + fName;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // all constructors and methods have access to the static class variables.. it will be implicit but the syntax is: Student.univ
        System.out.println("University: " + univ);
    }
}
