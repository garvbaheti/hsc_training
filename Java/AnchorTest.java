package com.edu.MavTest;


abstract class DataTransfer{
	public abstract void sendSMS();
	public abstract void sendEmail();
	public abstract void sendPushNotification();
	
	public void display() {
		System.out.println("message Delivered");
	}
}

public class AnchorTest extends DataTransfer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anchor anc = new Anchor();
		anc.callfunction(false);
		System.out.println();
		AnchorTest obj = new AnchorTest();
		obj.display();
		obj.sendEmail();
		obj.sendPushNotification();
		obj.sendSMS();
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS Delivered");
	}

	@Override
	public void sendEmail() {
		// TODO Auto-generated method stub
		System.out.println("Email Delivered");
	}

	@Override
	public void sendPushNotification() {
		// TODO Auto-generated method stub
		System.out.println("Notification Delivered");
		
	}

}