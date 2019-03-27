package com.newt;

public class HailStone {
	public static void main(String[] args) {
		HailStone1 hmt = new HailStone1();

		int n = 21;
		int x;
		x = hmt.Hailstone(n);
		System.out.println("\nNumber of Steps: " + x);
	}

}
