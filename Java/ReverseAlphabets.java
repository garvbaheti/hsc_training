package com.edu.MavTest;

public class ReverseAlphabets {
    public static void main(String[] args) {
        int asciiValue = 122; // ASCII value for 'z'

        do {
            char alphabet = (char) asciiValue;
            System.out.print(alphabet + " ");
            asciiValue--;
        } while (asciiValue >= 97); // ASCII value for 'a'
    }
}
