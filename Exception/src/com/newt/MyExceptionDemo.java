package com.newt;

public class MyExceptionDemo {
	public static void main(String[] args) {
		Account myacc = new Account(700);
		try {
			myacc.withdraw(400);
		} catch (MinBalanceException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated catch block
		// e.printStackTrace();
		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block");
		}
		System.out.println("normal flow");

	}
}
