<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="HelloServlet" method="post">
		<table>

			<tr>
				<th>First Name:</th>
				<td><input type="text" name="firstName" value=""
					placeholder="enter your first name"></td>
			</tr>

			<tr>
				<th>Last Name:</th>
				<td><input type="text" name="lastName" value=""
					placeholder="enter you last name"></td>
			</tr>

			<tr>
				<th></th>
				<td><input type="submit" value="save"></td>
			</tr>

		</table>
	</form>

</body>
</html>