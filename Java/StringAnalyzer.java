package com.edu.MavTest;

public class StringAnalyzer {
    public static void main(String[] args) {
        String input = "aksajd5676@$%^";
        int numCount = 0;
        int alphaCount = 0;
        int totalSize = input.length();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                numCount++;
            } else if (Character.isLetter(ch)) {
                alphaCount++;
            }
        }

        System.out.println("No of Numbers: " + numCount);
        System.out.println("No of Alphabets: " + alphaCount);
        System.out.println("Total Size: " + totalSize);
    }
}
