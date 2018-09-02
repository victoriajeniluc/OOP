package com.vikky.lecture20.test;
/**
 * LOCAL variables can be declared with final modifier only.
 *
 * static, public, protected and private cannot be used with LOCAL variables.
 *
 * @author Udayan Khattry
 */


public class LocalVariable {
    public void m1(final String s1, final int i1) {
        final int x = 5;
        System.out.println(x);
    }
}
