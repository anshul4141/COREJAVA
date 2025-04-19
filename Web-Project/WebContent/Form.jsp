<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="FormData.jsp" method="post">
		<center>
			<table>
				<tr>
					<th>First Name</th>
					<td><input type="text" name="firstName"
						placeholder="enter first name"></td>
				</tr>

				<tr>
					<th>Last Name</th>
					<td><input type="text" name="lastName"
						placeholder="enter last name"></td>
				</tr>

				<tr>
					<th>Email</th>
					<td><input type="email" name="loginId"
						placeholder="enter email id"></td>
				</tr>

				<tr>
					<th>Password</th>
					<td><input type="password" name="password"
						placeholder="enter password"></td>
				</tr>

				<tr>
					<th>DOB</th>
					<td><input type="date" name="dob"></td>
				</tr>

				<tr>
					<th>Click here</th>
					<td><input type="submit" value="save"></td>
				</tr>
			</table>
		</center>
	</form>

</body>
</html>