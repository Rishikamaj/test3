package com.newt;


public class SynchronizeThread {

	public static void main(String[] args) {
		Account acc = new Account();
		AtmMachine t1 = new AtmMachine(acc);
		EBanking t2 = new EBanking(acc);
		t1.start();
		t2.start();

	}
}

class Account{
	int balance=5000;
	synchronized void ATMWithdraw(int amt){
		
		//synchronized(this){
		if(balance-amt>=0){
			try{ Thread.sleep(100);}catch(Exception e){}
			balance=balance-amt;
			System.out.println("Got money from ATM:\n Current Balance:"+balance);

		}

	else
	{System.out.println("Insufficient Balance");
	}}
	
	//}//end of Synchronized

	synchronized void ebankWithdraw(int amt){
		//synchronized(this) {
		if(balance-amt>=0){
			try{ Thread.sleep(10);}catch(Exception e){}
			balance=balance-amt;
	 System.out.println("Got money from e-banking:\n Current Balance:"+balance);
		}
		else{System.out.println("Insufficient Balance");} 
		//}//end of synchronized
	}
}

class AtmMachine extends Thread {
	Account acc;

	AtmMachine(Account acc) {
		this.acc = acc;
	}

	public void run() {
		acc.ATMWithdraw(5000);
	}
}

class EBanking extends Thread {
	Account acc;

	EBanking(Account acc) {
		this.acc = acc;
	}

	public void run() {
		acc.ebankWithdraw(5000);
	}
}