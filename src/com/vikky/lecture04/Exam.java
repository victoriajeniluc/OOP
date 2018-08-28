package com.vikky.lecture04;

public class Exam {
    public String name;
    public int score1;
    public int score2;
    public int score3;

    public Exam(String n, int s1, int s2, int s3) {
        name = n;
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }

    // TODO: Write an instance method to display the following message:
    // Welcome <name>!
    // <name> will be replaced with name provided during instantiation

    public void displayGreeting() {
        System.out.println("Welcome " + name + "!");
    }

    // TODO: Write an instance method, which returns the sum of the scores
    public int getTotalScore() {
        int totalScore = score1 + score2 + score3;
        return totalScore;
    }

    // TODO: Write a method which accepts 3 int parameters and return their sum
   static public int calculateTotal(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        return total;
    }

    // TODO: Write a static method which accepts two String and returns an array object containing the passed Strings
    public static String[] convertToArray(String str1, String str2) {
        String [] arr = {str1, str2};
        return arr;
    }
}
