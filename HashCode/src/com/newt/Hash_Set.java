package com.newt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hash_Set {
	public static void main(String[] args) {
		Set<Employee> list = new HashSet<Employee>();

		list.add(new Employee("riya"));
		list.add(new Employee("ram"));
		list.add(new Employee("riya"));
		System.out.println("before sorting random values");

		for (Employee sorted : list) {
			System.out.println(sorted);

		}
		List<String> listing = new ArrayList<String>();
		Collections.sort(listing);
		System.out.println("after sorting");
		for (String sorted1 : listing) {
			System.out.println(sorted1);
		}
	}
}
