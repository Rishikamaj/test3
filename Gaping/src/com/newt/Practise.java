package com.newt;

public class Practise {

	public static void main(String[] args) throws java.lang.ArrayIndexOutOfBoundsException {
		int[] c = { 2, 9, 4, 7, 6 };
		int max = 0;
		int[] b = new int[5];

		for (int i = 0; i < c.length; i++) {
			b[5] = Math.abs(c[i] - c[i + 1]);

		}
		for (int j = 0; j < b.length; j++) {
			if (b[j] > max) {
				max = b[j];
			}
			System.out.println(max);
		}

	}
}
