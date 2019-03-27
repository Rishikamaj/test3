package com.newt;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.EmployeeName != e2.EmployeeName) {
			return e1.getEmployeeName().compareTo(e2.getEmployeeName());
		} else if (e1.EmployeeName == e2.EmployeeName)

		{
			return e1.getEmployeeAge() == e2.getEmployeeAge() ? 0 : e1.getEmployeeAge() > e2.getEmployeeAge() ? 1 : -1;

		} else {
			return e1.getEmployeeSalary() == e2.getEmployeeSalary() ? 0
					: e1.getEmployeeSalary() > e2.getEmployeeSalary() ? 1 : -1;
		}
	}
}



