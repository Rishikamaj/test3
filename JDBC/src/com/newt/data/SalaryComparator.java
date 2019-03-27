package com.newt.data;

import java.util.Comparator;

import com.newt.database.entity.Employee;

public class SalaryComparator implements Comparator<Employee> {

/*	@Override
	public int compareTo(Employee e1) {
		return e1.getesalary() == e2.getesalary() ? 0 : e1.getesalary() > e2.getesalary() ? 1 : -1;

	}*/

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getesalary() == e2.getesalary() ? 0 : e1.getesalary() > e2.getesalary() ? 1 : -1;
	
	}

}
