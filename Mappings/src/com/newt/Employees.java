package com.newt;

import java.util.Date;

public class Employees {

	int employeeId;
	String First_Name;
	String Last_Name;
	Date hire_Date;
	double salary;
	String department;
	int managerId;

	Employees() {
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public Date getHire_Date() {
		return hire_Date;
	}

	public void setHire_Date(Date hire_Date) {
		this.hire_Date = hire_Date;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((First_Name == null) ? 0 : First_Name.hashCode());
		result = prime * result + ((Last_Name == null) ? 0 : Last_Name.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((hire_Date == null) ? 0 : hire_Date.hashCode());
		result = prime * result + managerId;
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
		Employees other = (Employees) obj;
		if (First_Name == null) {
			if (other.First_Name != null)
				return false;
		} else if (!First_Name.equals(other.First_Name))
			return false;
		if (Last_Name == null) {
			if (other.Last_Name != null)
				return false;
		} else if (!Last_Name.equals(other.Last_Name))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (hire_Date == null) {
			if (other.hire_Date != null)
				return false;
		} else if (!hire_Date.equals(other.hire_Date))
			return false;
		if (managerId != other.managerId)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", hire_Date=" + hire_Date + ", salary=" + salary + ", department=" + department + ", managerId="
				+ managerId + "]";
	}

	public Employees(int employeeId, String first_Name, String last_Name, Date hire_Date, double salary,
			String department, int managerId) {
		super();
		this.employeeId = employeeId;
		this.First_Name = first_Name;
		this.Last_Name = last_Name;
		this.hire_Date = hire_Date;
		this.salary = salary;
		this.department = department;
		this.managerId = managerId;
	}

}
	