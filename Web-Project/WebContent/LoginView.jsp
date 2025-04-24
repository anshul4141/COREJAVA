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
	<h1 align="center">Login</h1>

	<%
		String msg = (String) request.getAttribute("msg");
	%>

	<%
		if (msg != null) {
	%>
	<h3 align="center"><%=msg %></h3>
	<%
		}
	%>

	<form action="LoginCtl" method="post">
		<center>
			<table>
				<tr>
					<th>Login</th>
					<td><input type="email" name="loginId"
						placeholder="enter email id"></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" name="password"
						placeholder="enter password"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="SignIn" name="operation"></td>
				</tr>
			</table>
		</center>

	</form>

</body>
</html>