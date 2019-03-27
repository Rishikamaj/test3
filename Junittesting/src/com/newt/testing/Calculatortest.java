package com.newt.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;

import com.newt.Calculator;

public class Calculatortest {
	Calculator calc;

	@BeforeEach
	public void initEnv() {
		calc = new Calculator();
	}

	@Test
	public void UTC_100() {
		int input1 = 7;
		int input2 = 3;
		int expected = 4;
		int actual = calc.sub(input1, input2);
		assertEquals(expected, actual);
	}

	@AfterAll
	public void cleanEnv() {
		System.gc();
	}

}
