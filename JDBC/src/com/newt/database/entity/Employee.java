package com.newt.database.entity;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	int id;
	String name;
	int age;
	double salary;

	public Employee() {

	}

	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getNAme() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int geteid() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String geteno() {
		// TODO Auto-generated method stub
		return null;
	}

	public int geteage() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getesalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Employee UpdateEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	
	


	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getesalary() == e2.getesalary() ? 0 : e1.getesalary() > e2.getesalary() ? 1 : -1;
	}}
