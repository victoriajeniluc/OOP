package com.vikky.lecture06;

class Methods {
    public static void m1() {
        System.out.println("static method m1().");
    }

    public static void m2() {
        System.out.println("static method m2().");
        // same as Methods.m1(); but since they are in the same class.. you don't need the Methods part. just the m1();
        m1(); // calling static method
        // this.m3();  -- insteance method can't be invoked from static methods because it doesn't get what "this" is
    }

    public void m3() {
        System.out.println("static method m3().");
    }

    public void m4() {
        System.out.println("static method m4().");

        // instance methods can only be invoked by objects or other instance methods.... they can't do it in static methods
        this.m3();
        // same as Methods.m1(); but since they are in the same class.. you don't need the Methods part. just the m1();
        m1();
    }
}

public class TestMethods {
    public static void main(String[] args) {
        Methods.m2();
        System.out.println("---------------");
        Methods obj = new Methods();
        obj.m4();
    }
}
