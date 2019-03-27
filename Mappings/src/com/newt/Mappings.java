package com.newt;

import java.sql.SQLException;


public class Mappings {
	public static void main(String[] args) throws SQLException {
		MapMethods mp = new MapMethods();
		System.out.println(mp.getEmployees("ACCOUNTS"));

	}
}
