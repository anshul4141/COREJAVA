package com.rays.jdbc.preparedstatement;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUserModel {

	public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {

		// testAdd();
		// testUpdate();
		// testDelete();
		testSearch();

	}

	private static void testSearch() throws ClassNotFoundException, SQLException {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (UserBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogin());
			System.out.print("\t" + bean.getPassword());
			System.out.println("\t" + bean.getDob());

		}

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
