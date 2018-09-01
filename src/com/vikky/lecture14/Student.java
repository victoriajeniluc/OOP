package com.vikky.lecture14;

/**
 * This class isn't encapsulated at all, because all the properties / attributes
 * are declared as public. Which means classes outside this package can
 * get/set the values of these properties directly.
 *
 * @author Udayan Khattry
 */

public class Student {
    private int id; //instance variable with public access modifier
    private String name; //instance variable with public access modifier
    private int age; //instance variable with public access modifier

    /**
     * Parameterized constructor.
     *
     * @param id id of the student
     * @param name name of the student
     * @param age age of the student
     */
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        checkAndChangeAge(age);
    }

    // write a method to access the age if we change it to a private access during declaration
    public int getAge() {
        return age;
    }

    // Write a method to be able to set the property age... since the logical in checkAndChangeAge happens in the constructor and the set method... move it out to its own method so we can use it multiple times
    public void setAge(int age) {
        checkAndChangeAge(age);
    }

    // write a method that will be able to be resused for the setAge and the constructor
    public void checkAndChangeAge(int age) {
        //Allowed age is between 18 and 40
        if(age >= 18 && age <= 40) {
            this.age = age;
        } else {
            System.out.println("Age should be between 18 and 40 only.");
            System.out.println("Exiting the program...");
            System.exit(-1); //a nonzero status code argument indicates abnormal termination.
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Prints all the properties of Student object.
     */
    public void printDetails() {
        System.out.println("Student Details: id = " + id + ", name = " + name + ", age = " + age);
    }
}
