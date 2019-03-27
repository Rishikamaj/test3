package com.newt;
import java.util.Scanner;

public class Vowelornot {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any alphabet");
	 String str=sc.next();
	 int pos=sc.nextInt();
	 char ch =str.charAt(pos);
	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		 System.out.println("the entered value is a vowel");
	 }
	else {
		System.out.println("the entered value is not a vowel");
sc.close();

}
}
}