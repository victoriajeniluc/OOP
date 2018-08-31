package com.vikky.lecture12;

/**
 * A class to show the steps of when the constructors / intialization blocks get executed
 * @author Udayan Khattry
 */

public class InitializationBlocks2 {
    public int x = 0; //4, 8
    public static int y = 2017; // 1

    public InitializationBlocks2() {
        System.out.println("No- arg constructor");
    } // 7

    public InitializationBlocks2(int x) {
        System.out.println("Parameterized constructor");
    } // 11

    static {
        System.out.println("1st static initialization block.");
    } // 2

    {
        System.out.println("1st instance initialization block.");
    } // 5, 9

    static {
        System.out.println("2nd static initialization block.");
    } // 3

    {
        System.out.println("2nd instance initialization block.");
    } // 6, 10

    public static void main(String[] args) {
        new InitializationBlocks2();
       new InitializationBlocks2(5);

    }

}

