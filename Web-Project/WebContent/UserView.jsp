<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="Header.jsp"%>


	<%
		String msg = (String) request.getAttribute("msg");
		UserBean bean = (UserBean) request.getAttribute("bean");
	%>

	<%
		if (bean != null) {
	%>
	<h1 align="center">Update User</h1>
	<%
		} else {
	%>
	<h1 align="center">Add User</h1>
	<%
		}
	%>

	<%
		if (msg != null) {
	%>
	<h3 align="center"><%=msg%></h3>
	<%
		}
	%>

	<form action="UserCtl.do" method="post">
		<input type="hidden" name="id"
			value="<%=bean != null ? bean.getId() : ""%>">
		<center>
			<table>
				<tr>
					<th>First Name</th>
					<td><input type="text" name="firstName"
						value="<%=bean != null ? bean.getFirstName() : ""%>"
						placeholder="enter first name"></td>
				</tr>

				<tr>
					<th>Last Name</th>
					<td><input type="text" name="lastName"
						value="<%=bean != null ? bean.getLastName() : ""%>"
						placeholder="enter last name"></td>
				</tr>

				<tr>
					<th>Email</th>
					<td><input type="email" name="loginId"
						value="<%=bean != null ? bean.getLogin() : ""%>"
						placeholder="enter email id"></td>
				</tr>

				<tr>
					<th>Password</th>
					<td><input type="password" name="password"
						value="<%=bean != null ? bean.getPassword() : ""%>"
						placeholder="enter password"></td>
				</tr>

				<tr>
					<th>DOB</th>
					<td><input type="date"
						value="<%=bean != null ? bean.getDob() : ""%>" name="dob"></td>
				</tr>

				<tr>
					<th></th>
					<td><input type="submit"
						value="<%=bean != null ? "update" : "save"%>" name="operation"></td>
				</tr>
			</table>
		</center>

	</form>

</body>
</html>