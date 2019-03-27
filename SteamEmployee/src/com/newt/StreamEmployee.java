package com.newt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class StreamEmployee {

	public static void main(String[] args) {
		Stream<Employee> employeeList = Stream.of(new Employee("rishi", "admin", 12000),
				new Employee("rishi", "admin", 12000), new Employee("rima", "security", 34000));

		String s = "rishi";
	//employeeList.stream().sorted((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()))
				//.forEach(System.out::println);
		 //employeeList.stream().map(Employee::ToUpperCase).forEach(System.out::println);
		//List<Integer> salary = (List<Integer>) employeeList.stream().filter(emp -> emp.getSalary() > 20000);
		//Stream.of("admin", "accounts", "admin").distinct().forEach(System.out::println);
		//employeeList.stream().map(Employee::getSalary).reduce((a,b)->a+b).ifPresent(System.out::println);
		//employeeList.stream().limit(1).forEach(System.out::println);
		employeeList.stream().distinct().forEach(System.out::println);

		//employeeList.stream().forEach(System.out::println);
		//boolean result = employeeList.stream().anyMatch(emp -> emp.getAccount().matches("admin"));
		//System.out.println(result);

		//boolean resul = employeeList.stream().allMatch(emp -> emp.getAccount().matches("admin"));
	//	System.out.println(resul);
		/*Stream<String> stringStream = Stream.of("rishi ", "rima");
		Stream<String[]> mycharArrayStream = stringStream.map(word -> word.split(""));
		Stream<String> mystream = mycharArrayStream.flatMap(Arrays::stream);
		mystream.forEach(System.out::println);*/

		//boolean res = employeeList.stream().noneMatch(emp -> emp.getAccount().matches("admin"));
		//System.out.println(res);
		//employeeList.stream().filter(emp -> emp.getAccount().matches("admin"))
		//.findFirst();
		//Optional<Employee> re = employeeList.stream().findFirst();
		//System.out.println(re);
		//Map<String, List<Employee>> mymap = employeeList.collect(groupingBy(Employee::getAccount));
		//System.out.println(mymap);
	 

		//employeeList.stream().filter(emp -> emp.getAccount().matches("admin")).findAny().ifPresent(System.out::println);
	}

}
