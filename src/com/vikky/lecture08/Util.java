/**
 * Example for how methods are ran during runtime - refer to the picture lecture8Methods5.png
 *
 * @author Udayan Khattry
 */

package com.vikky.lecture08;

import com.vikky.lecture07.Point;

public class Util {
    public static int increment(int x){
        x = x + 1;
        return x;
    }

    public static void incrementXY(Point pt) {
        pt = new Point(110, 202);
        pt.x = pt.x + 1;
        pt.y = pt.y + 1;
    }
}
