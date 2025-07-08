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
	<h3 align="center"><%=msg%></h3>
	<%
		}
	%>

	<div align="center">
		<form action="LoginCtl" method="post">

			<table>

				<tr>
					<th>Login:</th>
					<td><input type="email" name="login" value=""
						placeholder="enter your login"></td>
				</tr>

				<tr>
					<th>Password:</th>
					<td><input type="password" name="password" value=""
						placeholder="enter you password"></td>
				</tr>

				<tr>
					<th></th>
					<td><input type="submit" name="operation" value="SingIn"></td>
				</tr>

			</table>

		</form>
	</div>

</body>
</html>