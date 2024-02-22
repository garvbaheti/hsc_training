package com.edu.MavTest;

class Bank{
	public float getHomeLoanRate() {
		return 0f;
	}
}
class SBI extends Bank{
	public float getHomeLoanRate() {
		return 9.0f;
	}
}

class ICICI extends Bank{
	public float getHomeLoanRate() {
		return 8.0f;
	}
}

public class BTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		System.out.println(sbi.getHomeLoanRate());
		
		ICICI icici = new ICICI();
		System.out.println(icici.getHomeLoanRate());
		
	}

}
