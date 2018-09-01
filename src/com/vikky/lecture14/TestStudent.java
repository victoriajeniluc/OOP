package com.vikky.lecture14;

/**
 * This is the test class for com.udayan.lec01_1.Student class.
 *
 * @author Udayan Khattry
 */

public class TestStudent {
    public static void main(String[] args) {
        //Case 1:
        Student s1 = new Student(1001, "John", 25); //No issues over here as age >= 18 and age <= 40
        s1.printDetails();

        //Case 2: Below code tries to set age to out of range value and program terminates
        //Student s2 = new Student(1002, "Jack", 45);
        //s2.printDetails();

        //Case 3: Create Student object with valid age and then later change the age property.
        Student s3 = new Student(1003, "Joe", 30); //No issues over here as age >= 18 and age <= 40
       // s3.age = 200; //Directly setting age property, bypassing age range check... but we shouldn't allow this at all of changing the value... that's why we have to use a private access specifier or a access modifier!
            // once we switch age to private access... it gave us a compliation error because we can no   //Allowed age is between 18 and 40
        //        if(age >= 18 && age <= 40) {
        //            this.age = age;
        //        } else {
        //            System.out.println("Age should be between 18 and 40 only.");
        //            System.out.println("Exiting the program...");
        //            System.exit(-1); //a nonzero status code argument indicates abnormal termination.
        //        } longer access it! thus... giving us an opportunity to check the age of the object.. and create some logic for a specific age
        if(s3.getAge() == 25) {
            System.out.println("25% off of java courses");
        }
        s3.setAge(20);

        // just testing out setters and getters when changing all the properties with an access modifier with privates.
        s3.setId(3);
        s3.getId();
        s3.setName("Marson");
        s3.getName();
        s3.printDetails();

    }
}