package com.newt;

public class Account {
	int balance;

	public Account() {
	}

	public Account(int balance) {
		this.balance = balance;
	}

	public int withdraw(int amount) throws MinBalanceException {
		if (balance - amount >= 500) {
			balance = balance - amount;
			return balance;
		} else {
			throw new MinBalanceException("Min.of 500 rupees must be maintained");

		}

	}

}
