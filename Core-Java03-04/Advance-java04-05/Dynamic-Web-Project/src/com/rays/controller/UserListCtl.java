package com.rays.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.UserBean;
import com.rays.model.UserModel;

@WebServlet("/UserListCtl.do")
public class UserListCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		try {
			List list = model.search(bean);
			request.setAttribute("list", list);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("UserListView.jsp");
		rd.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		String op = request.getParameter("operation");

		String[] ids = request.getParameterValues("ids");

		if (op.equals("delete")) {

			if (ids != null && ids.length > 0) {
				for (String id : ids) {
					bean.setId(Integer.parseInt(id));
					model.delete(bean);
					request.setAttribute("msg", "data deleted successfully");
				}
			} else {
				request.setAttribute("msg", "select at least one record");
			}

		}

		try {
			List list = model.search(bean);
			request.setAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("UserListView.jsp");
		rd.forward(request, response);
	}

}
