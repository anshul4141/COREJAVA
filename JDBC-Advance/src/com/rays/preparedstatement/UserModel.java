package com.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserModel {

	public void add(UserBean bean) throws SQLException {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("insert into user values(?,?,?,?,?,?)");

			pstmt.setInt(1, bean.getId());
			pstmt.setString(2, bean.getFirstName());
			pstmt.setString(3, bean.getLastName());
			pstmt.setString(4, bean.getLogin());
			pstmt.setString(5, bean.getPassword());
			pstmt.setDate(6, new java.sql.Date(bean.getDob().getTime()));

			int i = pstmt.executeUpdate();

			System.out.println("data inserted: " + i);

			conn.commit();

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		}

	}

}
