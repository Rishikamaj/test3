package com.newt;
import java.util.Scanner;

public  class Employee {
	public int eno;
	public String name;
	private double salary;
	private static int celebrationfunds=0;
	



	
	
	
	
	Employee(int eno,String name,double salary ){
		this.eno=eno;
		this.name=name;
		this.salary=salary;
		celebrationfunds+=500;
	}
	public void printsalary() {System.out.println("salary of employee" +15000);}

	public  void independenceDayCelebration() {



		System.out.println("we celebrated independence day");



	}}
