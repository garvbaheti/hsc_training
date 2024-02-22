package com.edu.MavTest;

public class Anchor {

	public boolean status;
	
	public void callfunction(boolean stat) {
		status = stat;
		if(status) {
			System.out.println("Switch is ON");
		}
		else{
			System.out.println("Switch is OFF");
		}
	}
}