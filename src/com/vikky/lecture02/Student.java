package com.vikky.lecture02;
public class Student {
    public String name;
    public int age;
    public String university;
    public String course;
    public int year;
    public char gender;

    public Student(String studentName, char studentGender, int studentAge, int studentYear, String studentCourse, String studentUniversity) {
       name = studentName;
       gender = studentGender;
       age = studentAge;
       year = studentYear;
       course = studentCourse;
       university = studentUniversity;
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
