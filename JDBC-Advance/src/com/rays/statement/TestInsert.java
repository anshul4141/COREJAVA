package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();

			int i = stmt.executeUpdate(
					"insert into user values(2, 'Ram', 'Sharma', 'ram@gmail.com', 'ram123', '2001-02-02')");

			i = stmt.executeUpdate(
					"insert into user values(3, 'Pawan', 'Ydav', 'pawan@gmail.com', 'pawan123', '2001-02-02')");

			i = stmt.executeUpdate(
					"insert into user values(4, 'Pawan', 'Ydav', 'pawan@gmail.com', 'pawan123', '2001-02-02')");

			conn.commit();

			System.out.println("data inserted = " + (i + i + i));

		} catch (Exception e) {

			conn.rollback();

			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

}
