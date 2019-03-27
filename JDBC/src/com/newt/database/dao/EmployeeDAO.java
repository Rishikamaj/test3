package com.newt.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.newt.database.entity.Employee;

public class EmployeeDAO {
	public char[] readAllEmployee;

	public boolean createEmployee(Employee e) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String user = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		String inserQuery = "INSERT INTO EMPLOYEE(eid,eno,eage,esalary)VALUES(?,?,?,?)";
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement psmt = con.prepareStatement(inserQuery);
		psmt.setInt(1, e.geteid());
		psmt.setString(2, e.geteno());
		psmt.setInt(3, e.geteage());
		psmt.setDouble(4, e.getesalary());
		int rowsInserted = psmt.executeUpdate();
		return rowsInserted > 0 ? true : false;
	}

	public Employee readEmployee(int id) throws ClassNotFoundException, SQLException {
		Employee e = null;
		Class.forName("com.mysql.jdbc.Driver");
		String user = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		String inserQuery = "SELECT * FROM Employee WHERE eid=?";
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement psmt = con.prepareStatement(inserQuery);
		psmt.setInt(1, id);
		ResultSet rset = psmt.executeQuery();
		while (rset.next()) {
			int eid = rset.getInt("eid");
			String eno = rset.getString("eno");
			int eage = rset.getInt("eage");
			double esalary = (int) rset.getDouble("esalary");
			e = new Employee(eid, eno, eage, esalary);
		}

		return e;
	}

	public List<Employee> readAllEmployees() throws SQLException {
		List<Employee> employeeList = new ArrayList<Employee>();
		// Class.forName("com.mysql.jdbc.Driver");
		String user = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		Connection con = DriverManager.getConnection(url, user, password);
		String c = "SELECT COUNT(*) AS TOTAL FROM EMPLOYEE";
		PreparedStatement psmt1 = con.prepareStatement(c);
		ResultSet rset1 = psmt1.executeQuery();
		rset1.next();
		int totalcount = rset1.getInt("TOTAL");
		Employee[] e = new Employee[totalcount];

		String selectQuery = "SELECT * FROM Employee";

		PreparedStatement psmt = con.prepareStatement(selectQuery);

		ResultSet rset = psmt.executeQuery();
		while (rset.next()) {
			int eid = rset.getInt("eid");
			String eno = rset.getString("eno");
			int eage = rset.getInt("eage");
			double esalary = (int) rset.getDouble("esalary");

			Employee f = new Employee(eid, eno, eage, esalary);
			employeeList.add(f);
		}

		return employeeList;

	}

	public boolean updateEmployee(int eid) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String user = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		String count = "UPDATE EMPLOYEE SET eno= 'rishu' WHERE eid=?";
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement psmt3 = con.prepareStatement(count);
		// psmt3.setInt(1, emp.geteid());
		psmt3.setInt(1, eid);
		int rowsUpdated = psmt3.executeUpdate();
		System.out.println("update....");
		return rowsUpdated > 0 ? true : false;
	}

	boolean deleteEmployee(int id) {
		return true;
	}

}
