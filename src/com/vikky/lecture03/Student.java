package com.vikky.lecture03;
public class Student {
    public String name;
    public int age;
    // instead of the default constructor.. do this.. it still prints the same output with the university given as a parameter, as the default constructor with the assigned value of Standford University
    // this is assigning the value to the declaration of the property
    public String university = "Standford University";
    public String course;
    public int year;
    public char gender;

    public Student(String studentName, char studentGender, int studentAge, int studentYear, String studentCourse) {
       name = studentName;
       gender = studentGender;
       age = studentAge;
       year = studentYear;
       course = studentCourse;
    }


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
