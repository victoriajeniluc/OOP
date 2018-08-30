/**
 * Example for how methods are ran during runtime - refer to the picture lecture8Methods5.png
 *
 * @author Udayan Khattry
 */
package com.vikky.lecture08;

public class Point {
    public int x;
    public int y;

    // parameter constructor
    public Point(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public void printPoint() {
        System.out.println("Point: (" + x + ", " + y + "!");
    }
}
