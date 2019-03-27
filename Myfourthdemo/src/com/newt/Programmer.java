package com.newt;
import java.util.Scanner;

public class Programmer extends Employee {
	
	

	
		String language;
		public Programmer(int eno,String name,double salary, String language) {
			super(eno,name,salary);
			this.language=language;}
			public void printsalary() {
				System.out.println("salary of employee" +15000);
			}
			
		
		public void program() 
		{
			System.out.println("all the details of the programmer details:"+eno+" "+language);
			
		}
		
		
		

	}


