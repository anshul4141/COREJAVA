package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedik", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("insert into employee values(19, 'Pawan', 50000, 'NCS', 2)");

		System.out.println("data inserted successfully: " + i);

	}

}
