package com.edu.MavTest;

import java.util.*;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
    	// Check for presence of '@'
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }

        // Check for presence of '.'
        int dotIndex = email.indexOf('.', atIndex);
        if (dotIndex == -1 || dotIndex == atIndex + 1 || dotIndex == email.length() - 1) {
            return false;
        }

        // Check for consecutive dots or dot just before '@'
        for (int i = 0; i < email.length() - 1; i++) {
            if (email.charAt(i) == '.' && email.charAt(i + 1) == '.') {
                return false;
            }
        }

        if (email.charAt(atIndex - 1) == '.') {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        scanner.close();

        if (isValidEmail(email)) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }
}