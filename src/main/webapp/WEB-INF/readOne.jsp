<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Student Details</title>
</head>
<body>
<h1 align="center">Student Details</h1>
	<table border=1>
		<tr>
			<th bgcolor="bisque">Student Id</th>
			<th bgcolor="bisque">Student Name</th>
			<th bgcolor="bisque">Student Mobile Number</th>
			<th bgcolor="bisque">Student College</th>
			<th bgcolor="bisque">Student Domain</th>
			<th bgcolor="bisque">Student City</th>
		</tr>
		<tr>
			<td>${student.studentId}</td>
			<td>${student.studentName}</td>
			<td>${student.studentMobile}</td>
			<td>${student.studentCollege}</td>
			<td>${student.studentDomain}</td>
			<td>${student.studentCity}</td>
		</tr>
	</table>
	<br> <a href="home">Back To Home</a>
</body>
</html>