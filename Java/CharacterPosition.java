package com.edu.MavTest;

import java.util.*;

public class CharacterPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters:");
        String input = sc.nextLine();
        String[] chars = input.split(" ");

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]+(chars.length - i)+" ");
        }       
        sc.close();
	}

}
