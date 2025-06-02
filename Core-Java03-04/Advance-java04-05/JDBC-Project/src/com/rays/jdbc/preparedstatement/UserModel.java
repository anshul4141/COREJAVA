package com.rays.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;

// add, update, delete, search
public class UserModel {

	public void add(UserBean bean) {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedik", "root", "root");

			conn.prepareStatement("insert into user values(?, ?, ?, ?, ?, ?)");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
