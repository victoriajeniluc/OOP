package com.vikky.lecture04;

public class TestExam {
    public static void main(String[] args) {

        Exam e1 = new Exam("Jack", 84, 75, 90);
        e1.displayGreeting();

        System.out.println("----------------");
        int res1 = e1.getTotalScore();
        System.out.println(res1);
        System.out.println("----------------");
        //  use the class name since it confusing in Java since the way we invoke a static method is the same way as an instance method... instead of the instance variable created on line 6 to get rid of the warning  -- change e1.calculateTotal(10,20,30); to Exam.calculateTotal(10,20,30);
        int res2 = Exam.calculateTotal(10, 20, 30);
        System.out.println(res2);
        System.out.println("----------------");
        // you can use the properties in e1 to actually calculate the scores that was created in the exam.java!
        // use the class name since it confusing in Java since the way we invoke a static method is the same way as an instance method... instead of the instance variable created on line 6 to get rid of the warning  -- change e1.calculateTotal(10,20,30); to Exam.calculateTotal(10,20,30);
        int res3 = Exam.calculateTotal(e1.score1, e1.score2, e1.score3);
        System.out.println(res3);
        System.out.println("----------------");
       String [] arr =  Exam.convertToArray("one", "two");
    for(String str : arr) {
        System.out.println(str);
    }
    }
}
