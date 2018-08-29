/**
 * Testing and playing around with nullPointException
 *
 * @author Udayan Khattry
 */
package com.vikky.lecture05;

class Point {
    public int x;
    public int y;
    public Point(int x1, int y1) {
        x = x1;
        y = y1;
    }
    public void printPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class NPE {
    public static void main(String[] args) {
       // TEST 2 with an variable with the value of null: though, if an object is assigned to null... it can throw a null pointer error (Exception in thread "main" java.lang.NullPointerException at com.vikky.lecture05.NPE.main(NPE.java:19))  since the  variable doesn't know what know what object to reference to.. and the lines 22 and 23 will not be executed through this exception
       Point p1 = null;


       //TEST 3 where to fix people from setting nulls to the Point variable... always have check with the value of the variable!
        // Since null is a literal, so the compiler is 100% sure that at the time of the execution of boolean expression of the if-block, p1 will be null and that is why IntelliJ is showing us that warning.
        // Had it been some method call such as:
        // Point p1 = searchPoint(10, 5); [assuming searchPoint(int, int) method exists] and if the searchPoint(10, 5) returned null, then you would not get the warning. Result of the searchPoint(10,5) is available at runtime only

        if(p1 != null) {
            //  TEST 1 where if it is executed correctly: Point p1 =  new Point(10,20); // this creates a point object in the memory with two properties(x,y) where x is initialize to 10 and y is initialize to 20. there is a point variable that references to the point object that was created
            System.out.println(p1.x);
            System.out.println(p1.y);
            p1.printPoint();
        }
    }
}