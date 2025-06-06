package com.rays.jdbc.preparedstatement;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestUserModel {

	public static void main(String[] args) throws ParseException {

		//testAdd();
		testUpdate();
		//testDelete();

	}

	private static void testDelete() {
		
		UserModel model = new UserModel();
		
		UserBean bean = new UserBean();
		
		bean.setId(2);
		
		model.delete(bean);
		
	}

	private static void testUpdate() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserModel model = new UserModel();

		UserBean bean = new UserBean();

		bean.setId(3);
		bean.setFirstName("Vedik");
		bean.setLastName("Vishwakarma");
		bean.setLogin("vedik123@gmail.com");
		bean.setPassword("vedik@123");
		bean.setDob(sdf.parse("2002-02-02"));

		model.update(bean);

	}

	private static void testAdd() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserModel model = new UserModel();

		UserBean bean = new UserBean();

		bean.setId(2);
		bean.setFirstName("Vedik");
		bean.setLastName("Vishwakarma");
		bean.setLogin("vedik@gmail.com");
		bean.setPassword("vedik123");
		bean.setDob(sdf.parse("2002-02-02"));

		model.add(bean);

	}

}
