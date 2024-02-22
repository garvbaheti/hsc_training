package com.edu.MavTest;

import java.util.Scanner;

public class DataTypeIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input: ");
        String input = sc.nextLine();
        sc.close();
        try {
            int integerValue = Integer.parseInt(input);
            System.out.println("Input is an integer.");
        } catch (NumberFormatException e1) {
            try {
                float floatValue = Float.parseFloat(input);
                System.out.println("Input is a float.");
            } catch (NumberFormatException e2) {
                if (input.length() == 1) {
                    System.out.println("Input is a character.");
                } else {
                    System.out.println("Input is a string.");
                }
            }
        }

        
    }
}
