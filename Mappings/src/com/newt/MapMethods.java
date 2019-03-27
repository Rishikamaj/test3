package com.newt;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapMethods {
	public int dateToYear(Date hire_Date) {
		// Date hire_Date1 = null;
		Calendar cal = Calendar.getInstance();
		cal.setTime(hire_Date);
		int year = cal.get(Calendar.YEAR);
		return year;
	}

	public Map<Integer, Set<Employees>> getEmployees(String department) throws SQLException {
		EmployeeDAO edao = new EmployeeDAO();
		List<Employees> employeesList = edao.readAllEmployees();
		System.out.println("Filtering the Employees by Department:....");
		Iterator<Employees> iter = employeesList.iterator();
		while (iter.hasNext()) {
			Employees employees = (Employees) iter.next();
			if (!employees.getDepartment().equalsIgnoreCase(department))
				iter.remove();
			//
		}
		for (Employees employees : employeesList) {
			System.out.println(employees);
		}
		Map<Integer, Set<Employees>> myMap = new TreeMap<Integer, Set<Employees>>(Collections.reverseOrder());
		for (Employees employees : employeesList) {
			Integer year = dateToYear(employees.getHire_Date());
			Set<Employees> empSetOfSameYear = myMap.get(year);
			if (empSetOfSameYear == null)
				empSetOfSameYear = new TreeSet<Employees>(Collections.reverseOrder((Object e1,
						Object e2) -> ((Employees) e1).getHire_Date().compareTo(((Employees) e2).getHire_Date())));
			empSetOfSameYear.add(employees);
			myMap.put(year, empSetOfSameYear);
		}
		Set set= myMap.keySet()	;
		for(Object object:set) {
		System.out.println(object);	
		}
		
		return myMap;

	}
}
