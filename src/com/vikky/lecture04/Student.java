package com.vikky.lecture04;

public class Student {
    public String name;
    public int age;
    public int year;
    public String univ = "Standford University";

    public Student() {
        // same as this.year = 2016;
        year = 2016;
    }

    public Student(String studName, int studAge) {
        this();
        // same as: this.name and this.age
        name = studName;
        age = studAge;
    }

    public void printDetails() {
        System.out.println("Name: " +  name);
        System.out.println("Age: " +  age);
        System.out.println("Year: " +  year);
        System.out.println("University: " +  univ);
    }

    public static void main(String[] args) {
        Student s = new Student("Jack", 20);
        s.printDetails();
    }
}
