package com.newt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapping {

	public static void main(String[] args) {
		Map<Integer,Map<String,Integer>> m=new HashMap<Integer,Map<String,Integer>>();
		Map<String,Integer> innermap =new HashMap<>();
		innermap.put("rita",50);
		//Map<String,Integer>innermap1=new HashMap<>();
		//innermap1.put("rima", 51);
		//innermap.put("rima",51);
		//m.put(1,innermap);
		//m.put(1,"rima",51);
		
		Set set=m.entrySet(); 
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
		
	    	 Map.Entry entry=(Map.Entry)itr.next();  
	         System.out.println(entry.getKey()+" "+entry.getValue());  
	}}}


