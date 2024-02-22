package com.edu.MavTest;

public class ConstructorExample {
	
	ConstructorExample() {
		System.out.println("Unparametrised Constructor");
	}
	
	ConstructorExample(String name) {
		System.out.println("Paranetrised Constructor "+name);
	}
	
	public void display() {
		System.out.println("Function Overloaded");
	}
	
	public void display(long mobile) {
		System.out.println("Function Overloaded "+mobile);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample obj = new ConstructorExample();
		obj.display();
		
		System.out.println();
		
		ConstructorExample obj2 = new ConstructorExample("Rocker");
		obj2.display(9876543211L);
		
	}

}
