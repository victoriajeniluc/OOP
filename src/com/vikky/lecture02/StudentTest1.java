package com.vikky.lecture02;

public class StudentTest1 {
    public static void main(String[] args) {
        Student s1 = new Student("Vikky", 'F', 25, 2016, "DBA", "Standford University");

        Student s2 = new Student("John", 'M', 18, 2016, "Java", "Standford University");

        Student s3 = new Student("Jack", 'M', 17, 2016, "DBA", "Standford University");

        Student s4 = new Student("Lucy", 'F', 18, 2016, "SQL", "Standford University");

        s4.attendLab();
        s2.attendLecture();
        s1.submitAssignment();
        s3.submitAssignment();
        /*
        OUTPUT:
        Lucy is attending a lab at Standford University
John is attending their first lecture at the age of 18
Vikky submitted an assignment for the course called DBA
Jack submitted an assignment for the course called DBA
         */
    }
}
