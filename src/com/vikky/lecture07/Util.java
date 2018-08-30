/**
 * Example for how methods are ran during runtime - refer to the picture lecture8Methods5.png
 *
 * @author Udayan Khattry
 */

package com.vikky.lecture07;

public class Util {
    public static void increment(int x){
        x = x + 1;
    }
    public static void incrementXY(Point pt) {
        pt.x = pt.x + 1;
        pt.y = pt.y + 1;
    }
}
