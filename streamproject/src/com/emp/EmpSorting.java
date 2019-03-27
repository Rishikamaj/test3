package com.emp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;
import com.entity.Employee;
public class EmpSorting {
	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(101, "manju", 2017, "admin"),
				new Employee(102, "vani", 2017, "account"), new Employee(103, "geetha", 2018, "admin"),
				new Employee(104, "priya", 2018, "admin"), new Employee(105, "sree", 2016, "account"),
				new Employee(106, "mahi", 2016, "admin"), new Employee(108, "madhu", 2016, "admin"),
				new Employee(107, "manu", 2017, "admin"));
		System.out.println("Employee names grouped by dept and joing year");
		Map<String, Map<Integer, List<String>>> sort = list.stream().collect(
				groupingBy(Employee::getDept, groupingBy(Employee::getYear, mapping(Employee::getName, toList()))));
		System.out.println(sort);
		
	}
}
