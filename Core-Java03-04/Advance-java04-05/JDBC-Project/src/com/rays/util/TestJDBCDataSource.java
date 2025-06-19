package com.rays.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBCDataSource {

	public static void main(String[] args) throws SQLException {

		for (int i = 1; i <= 100; i++) {
			testSearch();
			System.out.println("connection: " + i);

		}

	}

	public static void testSearch() throws SQLException {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select * from user where id = ?");

		pstmt.setInt(1, 2);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.println("\t" + rs.getString(2));
		}

	}

}
