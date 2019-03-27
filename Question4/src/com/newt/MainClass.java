package com.newt;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		StudentSerialization sl = new StudentSerialization();
		Student sim = new Student("S1002", "Kavya","EEE",89);
		boolean dk = sl.addRecord(sim);
		System.out.println(dk);
		System.out.println(sl.retrieveRecord("S1002"));
		System.out.println(sl.retrieveRecord("S1001"));

	}
}
