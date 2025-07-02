package com.rays.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rays.bean.UserBean;
import com.rays.model.UserModel;

@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getParameter("operation");

		HttpSession session = request.getSession();

		if (op != null) {
			session.invalidate();
		}

		response.sendRedirect("LoginView.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getParameter("operation");

		UserBean bean = new UserBean();
		UserModel model = new UserModel();

		bean.setLogin(request.getParameter("login"));
		bean.setPassword(request.getParameter("password"));

		HttpSession session = request.getSession();

		if (op.equals("SingIn")) {
			try {
				bean = model.authenticate(bean.getLogin(), bean.getPassword());

				if (bean != null) {
					session.setAttribute("user", bean);
					response.sendRedirect("WelcomeCtl");
				} else {
					request.setAttribute("msg", "invalid login or password");
					RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
					rd.forward(request, response);
				}

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
