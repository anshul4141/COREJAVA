package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// step 1 load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2 make connection to the database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		// step 3 create statement
		Statement stmt = conn.createStatement();

		// step 4 Execute query and get ResultSet
		ResultSet rs = stmt.executeQuery("select * from marksheet");

		System.out.println("connection successfully");

		while (rs.next()) {

			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t"+rs.getInt(3));
			System.out.println("\t"+rs.getInt(5));

		}

	}

}
