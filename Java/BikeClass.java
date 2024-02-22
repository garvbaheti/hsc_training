package com.edu.MavTest;

class Vehicle{
	public void move() {
		System.out.println("Vehcile is Moving");
	}
}

public class BikeClass extends Vehicle {
	
	public void move() {
		System.out.println("Bike is Moving");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeClass obj = new BikeClass();
		obj.move();
	}

}
