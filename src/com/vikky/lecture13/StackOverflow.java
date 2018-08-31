package com.vikky.lecture13;

/**
 * Class to show how java.lang.StackOverflowError is thrown if there is no space in the STACK memory.
 *
 * @author Udayan Khattry
 */

public class StackOverflow {
    public static void main(String [] args) {
        main(args); // main method is calling itself - when this happens.. it keeps pushing the main method on top of the stack(or at least itself)... and there is a stop when the stack memory is all used up... which causes the error of stack overflow to be thrown
        // output:
        /*Exception in thread "main" java.lang.StackOverflowError
        at com.vikky.lecture13.StackOverflow.main(StackOverflow.java:11)
        at com.vikky.lecture13.StackOverflow.main(StackOverflow.java:11)
        at com.vikky.lecture13.StackOverflow.main(StackOverflow.java:11)
        .........
        */
    }

}