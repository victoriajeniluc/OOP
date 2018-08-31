package com.vikky.lecture13;

/**
 * Class to show how java.lang.StackOverflowError is thrown if there is no space in the STACK memory.
 *
 * @author Udayan Khattry
 */

public class StackOverflow {
    public static void main(String [] args) {
        main(args); // main method is calling itself

        // output:
        /*Exception in thread "main" java.lang.StackOverflowError
        at com.vikky.lecture13.StackOverflow.main(StackOverflow.java:11)
        at com.vikky.lecture13.StackOverflow.main(StackOverflow.java:11)
        at com.vikky.lecture13.StackOverflow.main(StackOverflow.java:11)
        .........
        */
    }

}