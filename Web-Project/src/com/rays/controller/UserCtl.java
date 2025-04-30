package com.rays.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.UserBean;
import com.rays.model.UserModel;

@WebServlet("/UserCtl.do")
public class UserCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		String id = request.getParameter("id");

		System.out.println("id = " + id);

		if (id != null) {

			try {
				bean = model.findByPk(Integer.parseInt(id));
				request.setAttribute("bean", bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		RequestDispatcher rd = request.getRequestDispatcher("UserView.jsp");
		rd.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		UserModel model = new UserModel();

		String op = request.getParameter("operation");

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");
		String dob = request.getParameter("dob");

		try {
			bean.setDob(sdf.parse(dob));
			bean.setFirstName(firstName);
			bean.setLastName(lastName);
			bean.setLogin(loginId);
			bean.setPassword(password);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		if (op.equals("save")) {

			try {
				bean.setId(8);
				model.add(bean);
				request.setAttribute("msg", "user added successfull");
			} catch (Exception e) {
				request.setAttribute("msg", e.getMessage());
				e.printStackTrace();
			}

		}

		if (op.equals("update")) {
			bean.setId(Integer.parseInt(request.getParameter("id")));
			try {
				model.update(bean);
				request.setAttribute("msg", "user Updated successfull");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		RequestDispatcher rd = request.getRequestDispatcher("UserView.jsp");
		rd.forward(request, response);

	}

}
