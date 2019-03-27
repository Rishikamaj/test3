package com.newt.program;
import java.util.Scanner;

public class Programmer extends Employee{
	String language;
	public Programmer(int eno,String name,double salary, String language) {
		super(eno,name,salary);
		this.language=language;
		
	}
	public void program() {
		System.out.println("all the details of the programmer:" programmer details\"+eno+" "+language);
		
	}

}
