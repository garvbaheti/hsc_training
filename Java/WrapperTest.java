package com.edu.MavTest;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=90; //Primitive
		Integer z = Integer.valueOf(y); //Wrapper
		System.out.println(z); //z is wrapper
		System.out.println(z.intValue()); //z is primitive
		
		Long u = (long) 907897;
		Long t = Long.valueOf(u);
		System.out.println(t.longValue());
	}

}
