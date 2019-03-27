package com.newt;

import java.sql.SQLException;
import java.util.*;

public class DatabaseDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InvalidAgeException,
			InvalidIdException, InvalidNameException, InvalidSalaryException {
		EmployeeTest empt = new EmployeeTest();
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("M1020101", "Jacob", 23, 34000));
		employeeList.add(new Employee("M1012020", "Anil", 21, 20000));
		employeeList.add(new Employee("M9078452", "Sunil", 27, 32000));
		employeeList.add(new Employee("M9003943", "Nauhid", 33, 50000));
		for (Employee employee : employeeList) {
			empt.createEmployee(employee);
		}
		Collections.sort(employeeList);
		for (Employee employee : employeeList) {
			System.out.println(employee);

		}
		Collections.sort(employeeList, new SalaryComparator());
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		Collections.sort(employeeList, new NameComparator());
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
