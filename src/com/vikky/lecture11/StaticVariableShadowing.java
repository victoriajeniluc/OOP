package com.vikky.lecture11;

public class StaticVariableShadowing {
    public static int i = 2017;

    public static void main(String[] args) {

        System.out.println(StaticVariableShadowing.i); // known as full name of development
        System.out.println(i); // shorthand notation where the compiler will use the class name implicitly

        for (int i = 0; i < 1; i++) { // i is considered a local variable in this case
            System.out.println(i);
        }
        System.out.println(i);
        {
            String i = "Hello"; // i is considered local variable in this case
            System.out.println(i);
        }

        double i = 15.67; // i is considered local variable in this case of main method
        System.out.println(i);
    }
}
