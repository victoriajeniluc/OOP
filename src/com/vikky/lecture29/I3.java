package com.vikky.lecture29;

// @FunctionalInterface // Multiple non-overriding abstract methods found in interface ... so this can be an issue where you can't tag this one since it has either more than 1 abstract method
public interface I3 extends I1, I2 {
    void m2();
}
