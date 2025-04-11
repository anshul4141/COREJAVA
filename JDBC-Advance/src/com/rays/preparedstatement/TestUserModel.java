package com.rays.preparedstatement;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestUserModel {

	public static void main(String[] args) throws Exception {

		// testAdd();
		// testUpdate();
		testDelete();
	}

	public static void testAdd() throws ParseException, SQLException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		bean.setId(5);
		bean.setFirstName("Pawan");
		bean.setLastName("Patidar");
		bean.setLogin("pawan@gmail.com");
		bean.setPassword("pawan123");
		bean.setDob(sdf.parse("2001-04-23"));

		UserModel model = new UserModel();

		model.add(bean);

	}

	public static void testUpdate() throws ParseException, SQLException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		bean.setId(5);
		bean.setFirstName("Rohit");
		bean.setLastName("Sharma");
		bean.setLogin("pawan@gmail.com");
		bean.setPassword("pawan123");
		bean.setDob(sdf.parse("2001-04-23"));

		UserModel model = new UserModel();

		model.update(bean);

	}

	public static void testDelete() throws Exception {

		UserBean bean = new UserBean();

		bean.setId(5);

		UserModel model = new UserModel();

		model.delete(bean);

	}

}
