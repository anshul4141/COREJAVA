package com.rays.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// add, update, delete, search
public class UserModel {

	public void add(UserBean bean) {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedik", "root", "root");

			PreparedStatement pstmt = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?, ?)");

			pstmt.setInt(1, bean.getId());
			pstmt.setString(2, bean.getFirstName());
			pstmt.setString(3, bean.getLastName());
			pstmt.setString(4, bean.getLogin());
			pstmt.setString(5, bean.getPassword());
			pstmt.setDate(6, new java.sql.Date(bean.getDob().getTime()));

			int i = pstmt.executeUpdate();
			System.out.println("data inserted successfully: " + i);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void update(UserBean bean) {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedik", "root", "root");

			PreparedStatement pstmt = conn.prepareStatement(
					"update user set firstName = ?, lastName = ?, login = ?, password = ?, dob = ? where id = ?");

			pstmt.setString(1, bean.getFirstName());
			pstmt.setString(2, bean.getLastName());
			pstmt.setString(3, bean.getLogin());
			pstmt.setString(4, bean.getPassword());
			pstmt.setDate(5, new java.sql.Date(bean.getDob().getTime()));
			pstmt.setInt(6, bean.getId());

			int i = pstmt.executeUpdate();
			System.out.println("data updated successfully: " + i);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(UserBean bean) {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedik", "root", "root");

			PreparedStatement pstmt = conn.prepareStatement("delete from user where id = ?");

			pstmt.setInt(1, bean.getId());

			int i = pstmt.executeUpdate();
			System.out.println("data delete successfully: " + i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List search(UserBean bean) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedik", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("select * from user");

		ResultSet rs = pstmt.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {
			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLogin(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			list.add(bean);
		}

		return list;

	}

}
