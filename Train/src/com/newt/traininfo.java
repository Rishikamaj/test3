package com.newt;

public class traininfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train t=new Train("Howrah Local",3567,"Kolkata","Chennai","11:40:00","2:00:00");
		System.out.println(t.getName());
		System.out.println(t.getCode());
		System.out.println(t.getOrigin());
		System.out.println(t.getDestination());
		System.out.println(t.getDeparturetime());
		System.out.println(t.getArrivaltime());


	}

}
