package com.newt;

import java.util.Scanner;

public class Controlstatements {
	public static void main(String[]args) {
	int a,b,c;
	System.out.println("enter the numbers");
	Scanner sc =new Scanner(System.in);
	 a=sc.nextInt();
	 b=sc.nextInt();
	 c=sc.nextInt();
	 if(a>b) {
		 System.out.println("a is greater than b:" +a);
		 
	 }
	 else if(b>c) {
		 System.out.println("b is greater than c:" +b);
	 }
	 else {
		 System.out.println("c is greatest:" +c);
	 }
	 }
	


}
