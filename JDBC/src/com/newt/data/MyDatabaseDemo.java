package com.newt.data;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.newt.database.dao.EmployeeDAO;
import com.newt.database.entity.Employee;

public class MyDatabaseDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Employee e = new Employee(2, "Roy", 32, 10000);

		EmployeeDAO edao = new EmployeeDAO();
		// edao.updateEmployee(1);
		// Employee[] emolist =edao.readAllEmployees();
		// int v=emolist.length;
		// for(int j= 0;j<v;j++) {

		List<Employee> employeeList = edao.readAllEmployees();
		Iterator<Employee> iter = employeeList.iterator();
		//for (Iterator iterator = employeeList.iterator(); iterator.hasNext();) { //first way
		//Employee employee = (Employee) iterator.next();
		//for(Employee employees:employeeList) {    //Second way
		//System.out.println(employees);
		//	}


		/*Collections.sort( employeeList);
		for(Employee employee:employeeList) {
			System.out.println(employee);
		}
		System.out.println("sort using salary:");
		// System.out.println(emolist[j]);
		//while (iter.hasNext()) {                  //Third way(modify)
		//Employee emp = iter.next();
		//System.out.println(emp);
		//iter.remove();
		//}
	/*	Collections.sort(employeeList, new SalaryComparator());
		for(Employee employee :employeeList) {
			System.out.println(employee);
		}
	}*/
		Collections.sort(employeeList (Object e1, Object e2)-> ((Employee)e1).getName)().compareTo(((Employee)e2).getName()));

}}
