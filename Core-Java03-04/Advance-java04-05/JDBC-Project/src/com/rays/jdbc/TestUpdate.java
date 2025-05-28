package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedik", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("update employee set name = 'Shavita' where id = 18");

		System.out.println("data updated successfully: " + i);
	}

}
