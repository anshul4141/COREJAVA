package com.rays.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

// step 1 make class final so child can not be created
public final class JDBCDataSource {

	// step 2 make default constructor private so other class can not instantiate
	private JDBCDataSource() {

	}

	// step 3 make self type of static variable, static variable have only one copy
	// in there life time
	private static JDBCDataSource datasource;

	private static ComboPooledDataSource cpds;

	// step 4 make getInstance method that return instance of same type
	public static JDBCDataSource getInstance() {

		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");

		if (datasource == null) {
			datasource = new JDBCDataSource();
			datasource.cpds = new ComboPooledDataSource();

			try {
				datasource.cpds.setDriverClass(rb.getString("driver"));
				datasource.cpds.setJdbcUrl(rb.getString("url"));
				datasource.cpds.setUser(rb.getString("username"));
				datasource.cpds.setPassword(rb.getString("password"));
				datasource.cpds.setMaxPoolSize(30);
				datasource.cpds.setAcquireIncrement(10);
				datasource.cpds.setInitialPoolSize(10);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return datasource;
	}

	public static Connection getConnection() throws SQLException {
		return getInstance().cpds.getConnection();
	}

}
