/**
 * refer to the picture lecture8Method5OtherEx... of how methods are invoked at runtime
 *
 * @author Udayan Khattry
 */

package com.vikky.lecture08;

import com.vikky.lecture07.Point;
import com.vikky.lecture07.Util;

public class TestUtil {
    public static void main(String[] args) {
        int i1 = 100;
        System.out.println("Value of i1 before increment: " + i1); // 100

        // HAD TO COMMENT IT OUT SINCE IT WAS GIVING AN ERROR
        // i1 = Util.increment(i1); // 101 because of the return statement.
        System.out.println("Value of i1 after increment: " + i1); // value of i1 after increment 101

        com.vikky.lecture07.Point point = new Point(10,20);
        System.out.println("Point before increment: ");
        point.printPoint(); // Point: (10,20)


        Util.incrementXY(point);
        System.out.println("Point after increment: ");
        point.printPoint(); // Point: (101, 201)

    }
}
