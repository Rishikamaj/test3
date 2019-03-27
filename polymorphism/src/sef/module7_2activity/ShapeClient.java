package sef.module7_2activity;

import java.awt.Point;
import java.util.Scanner;

public class ShapeClient {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		String[]sc=new String[5];
		for(int i = 0;i<=5;i++){
			sc[i]=s.next();


		}
		for(int k=0;k<5;k++) {
			if(sc[k].equals("Rectangle")) { 
				Rectangle r= new Rectangle("yellow",3,5,new Point(2,3));

			}

			else if(sc[k].equals("Triangle")) {
				Triangle t=new Triangle("black", 5,8,new Point(5,6));

			}
			else {
				System.out.println("nothing is available");
			}

		}




	}
}

