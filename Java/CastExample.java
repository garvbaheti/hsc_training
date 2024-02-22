package com.edu.MavTest;

public class CastExample {
	public static void main(String[] args) {
		char w = '2';
		int r = w;
		System.out.println(r);
		
		int a = w -'0';
		System.out.println(a);
		
		int b = Character.getNumericValue(w);
		System.out.println(b);
		
		String f ="2345";
		System.out.println(Integer.parseInt(f));
	}
}
