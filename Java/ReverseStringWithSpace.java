package com.edu.MavTest;

public class ReverseStringWithSpace {
	public static void main(String[] args) {
        String input = "Hyderabad";
        String reversed = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i)+" ");
        }
        return (reversed.toString()).trim();
    }
}
