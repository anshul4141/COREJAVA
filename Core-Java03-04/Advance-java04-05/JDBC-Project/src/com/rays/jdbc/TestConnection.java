package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Step 1 Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 Make Connection to the database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedik", "root", "root");

		// Step 3 Create Statement
		Statement stmt = conn.createStatement();

		// Step 4 execute query and get result set
		ResultSet rs = stmt.executeQuery("select * from employee");

		while (rs.next()) {

			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getInt(3));
			System.out.print("\t" + rs.getString(4));
			System.out.println("\t" + rs.getInt(5));

		}

	}

}
