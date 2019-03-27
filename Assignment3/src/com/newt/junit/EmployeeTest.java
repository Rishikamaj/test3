package com.newt.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.newt.Employee;
import com.newt.InvalidDept;
import com.newt.InvalidDesignation;

public class EmployeeTest {
	Employee emp;

	@BeforeEach
	public void initnow() {
		System.out.println("Init method");
		emp = new Employee();
	}

	@Test
	public void UTC_101() {
		int empId = 1002;
		String empName = null;
		String empDesig = "Lead";
		String empDept = "ITES";
		assertThrows(NullPointerException.class, () -> {
			emp.setEmpName(null);
		});

	}

	@Test
	public void UTC_102() {
		int empId = 1001;
		String empName = "Kumar";
		String empDesig = "Tester";
		String empDept = "C2";
		assertThrows(InvalidDesignation.class, () -> {
			emp.setEmpDesig("Tester");
		});
	}

	@Test
	public void UTC_103() {
		int empId = 1004;
		String empName = "Shanthi";
		String empDesig = "Manager";
		String empDept = "COE";
		assertThrows(InvalidDept.class, () -> {
			emp.setEmpDept("COE");
		});
	}

	@AfterEach
	public void end(){
		System.gc();
	}
}





