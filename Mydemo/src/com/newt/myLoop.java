package com.newt;

import java.util.Scanner;

public class myLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to be searched");
		int[] emp= new int[7];
		int num=sc.nextInt();
		int empno=0;
		System.out.println("enter the array elements");
		for(int i=0;i<7;i++)
		{
			emp[i]=sc.nextInt();
		}

		for(int i=0;i<7;i++)
		{
			if(num==emp[i])
			{
				System.out.println("the number is at postiion "+i);
				empno=i;
			}
		}
		System.out.println(empno);
		sc.close();
		}

	}
