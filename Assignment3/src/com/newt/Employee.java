package com.newt;

public class Employee {
int empId;
String empName;
String empDesig;
String empDept;
public Employee() {
	
}
public Employee(int empId,String empName,String empDesig,String empDept) {
	this.empId=empId;
	this.empName=empName;
		this.empDesig = empDesig;
		this.empDept = empDept;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		
			this.empId = empId;
	
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		if (empName != null)
			this.empName = empName;
		else
			throw new NullPointerException();

	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public void setempDesig(String empDesig) throws InvalidDesignation {
		// TODO Auto-generated method stub
		if (empDesig.equals("developer") || empDesig.equals("tester") || empDesig.equals("Leader")
				|| empDesig.equals("manager")) {
			this.empDesig = empDesig;
		} else
			throw new InvalidDesignation();

	}

	public String getDept() {
		return getDept();

	}

	public void setempDept(String empDept) throws InvalidDept {
		if (empDept.equals("C2") || empDept.equals("TTG") || empDept.equals("TES") || empDept.equals("PES")) {
			this.empDept = empDept;
		} else
			throw new InvalidDept();
	}
}
	
	
			
