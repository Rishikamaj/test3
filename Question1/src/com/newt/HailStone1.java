package com.newt;

public class HailStone1 {

	static int e;

	static int Hailstone(int n) {
		System.out.print(n + " ");

		if (n == 1 && e == 0) {
			return e;
		} else if (n == 1 && e != 0) {
			e++;
			return e;
		} else if (n % 2 == 0) {
			e++;
			Hailstone(n / 2);
		} else if (n % 2 != 0) {
			e++;
			Hailstone(3 * n + 1);
		}
		return e;
	}

}
