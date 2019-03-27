package com.newt;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getEmployeeSalary() == e2.getEmployeeSalary() ? 0
				: e1.getEmployeeSalary() > e2.getEmployeeSalary() ? 1 : -1;

	}
}
