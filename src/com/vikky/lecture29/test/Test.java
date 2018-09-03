package com.vikky.lecture29.test;

/**
 * This class uses abstract class (Electronics) reference to refer to instance of
 * concrete classes (SmartPhone, Television and Camera).
 *
 * @author Udayan Khattry
 */

import com.vikky.lecture29.Camera;
import com.vikky.lecture29.Electronics;
import com.vikky.lecture29.SmartPhone;
import com.vikky.lecture29.Television;

public class Test {
    public static void main(String[] args) {
        // This is polymorphous supertype reference to an instance variable subtype
        Electronics e1 = new SmartPhone();
        e1.powerOn();
        e1.operate();

        Electronics e2 = new Television("Star Sports");
        e2.powerOn();
        e2.operate();

        Electronics e3 = new Camera();
        e3.powerOn();
        e3.operate();

        //Compilation error for new Electronics(); as abstract classes cannot be instantiated.
//		Electronics e4 = new Electronics();
//		e4.powerOn();
//		e4.operate();
    }
}
