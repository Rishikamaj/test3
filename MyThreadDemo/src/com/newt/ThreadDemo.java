package com.newt;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(()-> {
			for (int i = 1; i < 11; i++) {
				System.out.println("child thread:--" + i);	
			}
				
		});

		t1.start();
		for (int i = 1; i < 10; i++) {
			System.out.println("main thread:" + i);
		}
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		new MyClass().Mymethod();

		}
		
		class MyClass{
			void Mymethod() {
				for (int i = 1; i < 11; i++) {
					System.out.println("child thread:--" + i);	
			}
		}

		}}

