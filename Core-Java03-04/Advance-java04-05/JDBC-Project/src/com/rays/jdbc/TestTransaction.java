package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransaction {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedik", "root", "root");

			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();

			int i = stmt.executeUpdate("insert into employee values(19, 'Ram', 4500, 'TCS', 2)");
			i = stmt.executeUpdate("insert into employee values(19, 'Ram', 4500, 'TCS', 2)");
			i = stmt.executeUpdate("insert into employee values(20, 'Ram', 4500, 'TCS', 2)");
			conn.commit();
			System.out.println("data inserted successfully: " + i);

		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
		}

	}

}
