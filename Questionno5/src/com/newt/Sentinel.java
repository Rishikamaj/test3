package com.newt;

import java.util.*;

public class Sentinel {

	public static void main(String args[]) {

		int[] numbers = { 11, 17, 42, 9, -3, 35, 0 };

		int[] n = find(numbers);

		System.out.println("Array={" + n[0] + "," + n[1] + "}");

	}

	public static int[] find(int[] number1) {
		int[] newarray = new int[2];

		int minimum = getMin(number1);
		int maximum = getMax(number1);

		for (int k = 0; k < 2; k++) {
			newarray[0] = minimum;
			newarray[1] = maximum;

		}

		for (int j = 0; j < 1; j++) {
			if (newarray[j] == 0)
				System.out.println("null");

		}

		return newarray;

	}

	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue && inputArray[i] != 0) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue && inputArray[i] != 0) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}
}
