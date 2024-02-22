package com.edu.MavTest;

public class CondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		if(a%4==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
