package com.newt;

import java.util.ArrayList;
import java.util.List;

public class CombineArray {

	public static void main(String[] args) {
		//List<CombineArray> y=new ArrayList<CombineArray>();
	//	int[] c;
		int sum=0;
		int[] a= {1,2,3,4};
		
		int[] b= {3,4,5,6};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
					sum+=a[i];
					//System.out.println(sum);
					
				}
				//System.out.println("sum: "+(sum);
				
		}
			
			
				
		
		
	

	}
		System.out.println("sum:"+sum);
		

}}
