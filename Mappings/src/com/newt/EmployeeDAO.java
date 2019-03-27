package com.newt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDAO {

	public List<Employees> readAllEmployees() throws SQLException {
		List<Employees> employeeList = new ArrayList<Employees>();
		String user = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/tr2";

		String selectQuery = "SELECT employee_id,first_name,last_name,hire_date,salary,department,manager_id from EMPLOYEES";
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement psmt = con.prepareStatement(selectQuery);

		ResultSet rset = psmt.executeQuery();

		while (rset.next()) {
			int employeeid = rset.getInt("employee_id");
			String first_name = rset.getString("first_name");
			String last_name = rset.getString("last_name");
			Date hire_date = rset.getDate("hire_date");
			double salary = rset.getDouble("salary");
			String department = rset.getString("department");
			int managerid = rset.getInt("manager_id");
			employeeList
					.add(new Employees(employeeid, first_name, last_name, hire_date, salary, department, managerid));

		}
		return employeeList;
	}
}
