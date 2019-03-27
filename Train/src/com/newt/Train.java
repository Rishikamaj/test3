package com.newt;
import java.util.Scanner;

public class Train {
     String name;
	 int code;
	 String origin;
	 String destination;
	 String departuretime;
	 String arrivaltime;
	 public String getName() {
		return name;
	}




	public int getCode() {
		return code;
	}




	public String getOrigin() {
		return origin;
	}




	public String getDestination() {
		return destination;
	}




	public String  getDeparturetime() {
		return departuretime;
	}




	public String getArrivaltime() {
		return arrivaltime;
	}




	//int arrivaltime;
	 Train(String name,int code, String origin,String destination,String departuretime,String arrivaltime)
	 {
		 this.name=name;
		 this.code=code;
		 this.origin=origin;
		 this.destination=destination;
		 this.departuretime=departuretime;
		 this.arrivaltime=arrivaltime;
		 
	 }
	 
	 
	
	
	

}
