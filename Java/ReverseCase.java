package com.edu.MavTest;

public class ReverseCase {
    public static void main(String[] args) {
        String input = "Java Fullstack";
        StringBuilder output = new StringBuilder(input.length());

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                output.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                output.append(Character.toUpperCase(ch));
            } else {
                output.append(ch);
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + output.toString());
    }
}
