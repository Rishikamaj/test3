package com.newt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OddEvens {

	public static void main(String[] args) {
	List l1=new ArrayList();
		int[] a= {12,1,32,3};
		int[] b= {0,12,2,23};
		for(int i=1;i<a.length;) {
			 
				l1.add(i);
			
				i=i+2;
			}
				
		List l2=new ArrayList();
		for(int j=0;j<b.length;) {
			
				l2.add(j);
				
			j=j+2;
		}
				
		l1.add(l2);
		System.out.println(l1 );
		
		
	}

}
