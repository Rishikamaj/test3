package com.newt;

public class TestVehicle {
	public static void main(String[] args) throws SpeedMorethanMaxSpeedException {
		Vehicle myvehi = new Vehicle(300,400);
		try {
			
			
			System.out.println(myvehi.IncreasedSpeed(600));
		} // TODO Auto-generated catch block
		// e.printStackTrace();
		catch (Exception s) {
			System.out.println(s.getMessage());
		} finally {
			System.out.println("finally block");
		}
		System.out.println("normal flow");

	}
}
	


