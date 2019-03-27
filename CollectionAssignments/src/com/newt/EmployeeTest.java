package com.newt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeTest {
	public boolean createEmployee(Employee employeeList) throws SQLException {
		String user = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		String inserQuery = "INSERT INTO Entity(EmployeeId,EmployeeName,EmployeeAge,EmployeeSalary)VALUES(?,?,?,?)";
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement psmt = con.prepareStatement(inserQuery);
		psmt.setString(1, ((Employee) employeeList).getEmployeeId());
		psmt.setString(2, ((Employee) employeeList).getEmployeeName());
		psmt.setInt(3, ((Employee) employeeList).getEmployeeAge());
		psmt.setDouble(4, ((Employee) employeeList).getEmployeeSalary());
		int rowsInserted = psmt.executeUpdate();
		return rowsInserted > 0 ? true : false;
	}

}
