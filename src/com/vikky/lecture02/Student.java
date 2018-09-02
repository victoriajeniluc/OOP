package com.vikky.lecture02;
public class Student {
    public String name;
    public int age;
    public String university;
    public String course;
    public int year;
    public char gender;

    public Student(String studentName, char studentGender, int studentAge, int studentYear, String studentCourse) {
        this(); // needs to be on the first statement of the constructor if you're trying to call it
       name = studentName;
       gender = studentGender;
       age = studentAge;
       year = studentYear;
       course = studentCourse;
    }

    // if all the students are from Standford.. you can just default it this way:

    // Changing this accessor since we won't be using this other than to read the university within this file. SINCE WE DID THAT WE CANT USE THE DEFAULT CONSTRUCTOR TO CREATE OBJECTS -- this gets comment out in StudentTest
    private Student() {
        university = "Standford University";
    }
    // the only problem with using default constructors is that if there is a object initialized ... and there are no values passed... they will create an object with default values except for the university... BETTER SOLUTION IN LECTURE03/STUDENT

    public void attendLecture(){
        System.out.println(name + " is attending their first lecture at the age of " + age);
    }

    public void submitAssignment() {
        System.out.println(name + " submitted an assignment for the course called " + course);
    }

    public void attendLab() {
        System.out.println(name + " is attending a lab at " + university);
    }

}
