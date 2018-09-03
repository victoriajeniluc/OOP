package com.vikky.lecture29;

/**
 * Electronics class is an abstract class and it has abstract method operate().
 *
 * @author Udayan Khattry
 */

// because we created a abstract method... we have to make this class abstract too
public abstract class Electronics {
    private boolean power = false;

    // putting final shows that no one will change this method at all.
    public final void powerOn() {
        power = true;
    }

    public final void powerOff() {
        power = false;
    }

    public final boolean isOn() {
        return power;
    }

    // how to declare a method but not define it
    public abstract void operate();
}
