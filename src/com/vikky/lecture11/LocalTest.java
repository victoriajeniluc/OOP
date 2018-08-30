package com.vikky.lecture11;

public class LocalTest {
    // variable args is a local variable but it is always initialized with String array instance containing 0 or more elements
    public static void main(String[] args) {
        // int i = 0; // same as int i; i = 0
        // final int i = 0; // for test 3... use the final keyword
           int i = 0; // remove the final for the test 4

        System.out.println(i); // it will give you warning if i is not being used or if it is not initialized after declaration... it NEEDS to be initialized before getting accessed.

        System.out.println("-----------------------------------");

        String str;
        // TEST 1: printing out str without initializing it before accessing it:
        // System.out.println(str); - gave an error to initialize str first

        // TEST 2: using an if block to initialize str and use i:
        /*if(i == 0) {
            str = "A"; - gave an error because it doesn't understand what i really is'
        }*/

        // TEST 3: putting int i as a final i to fix the test 2 problem..

       /* if(i == 0) {
            str = "A";
        }
        System.out.println(str); // A*/

        // TEST 4: putting an else there after the if statement
        if(i == 0) {
            str = "A";
        } else {
            str = "B";
        }
        System.out.println(str); // A
    }
}
