/**
 * This class is to explain the lifetime and the scope of a local variable
 *
 * @author Udayan Khattry;
 *
 * // Putting the debugger on line 10... it has put the main method on the stack with args variable reference to an empty space in the heap... it hasn't started its lifetime yet.. as soon as the main method has invoked and it will be alive until it stays in the stack memory
 *
 *  // STEP OVER - variable msg comes into existence as variable is defined directly in the main method... and it's life time ends as the program ends or the end of the main curly braces
 *
 *  // STEP OVER - variable i comes into existence and it will be alive until the for loop completes its execution  - ends mostly when the closing of the curly bracket of the for loop. Variable i is not accessible outside of the for loop body.
 *
 *  // STEP OVER - variable i is still in scope until the for loop is going to end - when i turns 2 then i disappears from being accessible. THOUGH THE args and  msg are accessible still.
 *  // STEP INTO - goes into the printMsg method is pushed ontop of the stack and the variable str has come to existence... it is alive until the printMsg is in the stack memory. str is only accessible in between the curly braces of printMsg.
 *         // ** NOTICE: main method is still in the stack - below the printMsg method - and args and msg is alive but not accessible - meaning that it is not in scope
 *
 * // STEP OVER - the printMsg method goes off the stack and the variable str dies... the main method is on top of the stack. args and msg are acccessible again.    // ** NOTICE: there are curly braces in between the int i = 100; and the System.out.println(i); but this is valid to be used when you want to shorten the scope of the variable i
 * .
 * // STEP OVER - variable i comes into existence and it will be alive until the block has executed within its scope. The scope is after the declaration statement and it ends before the closing bracket. args, msg, and i are accessible.
 * 
 * // STEP OVER - variable args and msg are accessible and i disappears - at the // main ends comment.
 *
 */
package com.vikky.lecture10;

public class LocalVariableScope {
    public static void main(String[] args) {
        String msg = "Welcome";

        for(int i = 0; i < 2; ) {
            System.out.println(++i);
        }

        printMsg(msg); // call printMsg(String) method

        {
            int i = 100;
            System.out.println(i);
        }
    } // main ends

    public static void printMsg(String str) {
        System.out.println(str);
    } // printMsg(String) ends
} // class ends
