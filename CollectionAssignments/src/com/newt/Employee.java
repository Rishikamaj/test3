package com.newt;

public class Employee implements Comparable<Employee>{
String EmployeeId;
String EmployeeName;
int EmployeeAge;
double EmployeeSalary;
Employee(){}
public String getEmployeeId() {
	return EmployeeId;
}
/*public void setEmployeeId(String employeeId) {
	EmployeeId = employeeId;
}*/
public String getEmployeeName() {
	return EmployeeName;
}
/*public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}*/
public int getEmployeeAge() {
	return EmployeeAge;
}
/*public void setEmployeeAge(int employeeAge) {
	EmployeeAge = employeeAge;
}*/
public double getEmployeeSalary() {
	return EmployeeSalary;
}
public void setEmployeeSalary(double employeeSalary) throws InvalidSalaryException {
	if(EmployeeSalary>0)
	this.EmployeeSalary = employeeSalary;
	else
		throw new InvalidSalaryException("invalid salary input");
}
public void setEmployeeId1(String EmployeeId) throws InvalidIdException {
	// TODO Auto-generated method stub
	if (EmployeeId.equals("M1020101") || EmployeeId.equals("M1012020") || EmployeeId.equals("M9078452")
			|| EmployeeId.equals("M9003943")) 
		this.EmployeeId = EmployeeId;
	else
		throw new InvalidIdException("invalid ");

}
public void setEmployeeAge(int EmployeeAge) throws InvalidAgeException {
	if (EmployeeAge>0) 
		this.EmployeeAge=EmployeeAge;	
	else
		throw new InvalidAgeException("invalid age");}
public void setEmployeeName1(String EmployeeName) throws InvalidNameException {
	if (EmployeeName.equals("Jacob") ||EmployeeName.equals("Anil") || EmployeeName.equals("Sunil") || EmployeeName.equals("Nauhid")) {
		this.EmployeeName = EmployeeName;
	} else
		throw new InvalidNameException();}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + EmployeeAge;
	result = prime * result + ((EmployeeId == null) ? 0 : EmployeeId.hashCode());
	result = prime * result + ((EmployeeName == null) ? 0 : EmployeeName.hashCode());
	long temp;
	temp = Double.doubleToLongBits(EmployeeSalary);
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
	if (EmployeeAge != other.EmployeeAge)
		return false;
	if (EmployeeId == null) {
		if (other.EmployeeId != null)
			return false;
	} else if (!EmployeeId.equals(other.EmployeeId))
		return false;
	if (EmployeeName == null) {
		if (other.EmployeeName != null)
			return false;
	} else if (!EmployeeName.equals(other.EmployeeName))
		return false;
	if (Double.doubleToLongBits(EmployeeSalary) != Double.doubleToLongBits(other.EmployeeSalary))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeAge=" + EmployeeAge
			+ ", EmployeeSalary=" + EmployeeSalary + "]";
}

	public Employee(String employeeId, String employeeName, int employeeAge, double employeeSalary)
			throws InvalidAgeException, InvalidIdException, InvalidNameException, InvalidSalaryException {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeAge = employeeAge;
		EmployeeSalary = employeeSalary;
		if (EmployeeId.charAt(0) == 'M')
			this.EmployeeId = EmployeeId;
		else
			throw new InvalidIdException("invalid ");

		if (EmployeeAge > 0)
			this.EmployeeAge = EmployeeAge;
		else
			throw new InvalidAgeException("invalid age");

		if (EmployeeName.equals("Jacob") || EmployeeName.equals("Anil") || EmployeeName.equals("Sunil")
				|| EmployeeName.equals("Nauhid"))
			this.EmployeeName = EmployeeName;
		else
			throw new InvalidNameException("invalid name");

		if (EmployeeSalary > 0)
			this.EmployeeSalary = employeeSalary;
		else
			throw new InvalidSalaryException("invalid salary input");
	}

	public int compareTo(Employee empt) {
		return this.EmployeeId.compareTo(EmployeeId);

	}

}
