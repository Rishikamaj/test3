package com.newt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Streamdemo {

	public static <R> void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee("Nataraja G", "Accounts", 8000),new Employee("Nagesh Y", "Admin", 15000),new Employee("Vasu V", "Security", 2500),new Employee("Amar", "Entertainment", 12500));
		

		empList.stream().sorted((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()))
		.forEach(System.out::println);
		empList.stream().filter(emp->emp.getAccount().matches("Admin"))
		.findFirst()
		.ifPresent(System.out::println);

		empList.stream().filter(emp->emp.getAccount().matches("Admin"))
		.findAny()
		.ifPresent(System.out::println);
		Predicate mymethod=(Employee)->true;
		mymethod.test(empList);
		Supplier mySupplier=()->empList;
		mySupplier.get();
	//Consumer<Employee> myConsumer=(Employee)->{};
	//myConsumer.accept((Employee) empList);
	//Function myfunction=Employee::new;
	//myfunction.apply(empList);
	 Stream.of(10,20,22,12,14).reduce((x,y)->x+y).ifPresent(System.out::println);
	 List<Integer>inList=Arrays.asList(5,6,7,8);
	 Optional <Integer>sum=inList.stream().reduce((x,y)->x+y);
	 System.out.println(sum.isPresent()?sum.get():"Invalid input");

	}

}
