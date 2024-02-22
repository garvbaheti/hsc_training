package com.edu.MavTest;

public class SumInRange {
    public static void main(String[] args) {
        int start = 239;
        int end = 6999;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("Sum from " + start + " to " + end + " is: " + sum);
    }
}
