<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Students List</title>
</head>
<body>
<h1 align="center">Student List</h1>
<center>
<table border=1>
	<tr>
		<th bgcolor="bisque">Student Id</th>
		<th bgcolor="bisque">Student Name</th>
		<th bgcolor="bisque">Student Mobile Number</th>
		<th bgcolor="bisque">Student College</th>
		<th bgcolor="bisque">Student Domain</th>
		<th bgcolor="bisque">Student City</th>
		
	</tr>
	<c:forEach var="StudentList" items="${list}">
		<tr>
			<td>${StudentList.studentId}</td>
			<td>${StudentList.studentName}</td>
			<td>${StudentList.studentMobile}</td>
			<td>${StudentList.studentCollege}</td>
			<td>${StudentList.studentDomain}</td>
			<td>${StudentList.studentCity}</td>
		</tr>
	</c:forEach>
	<tr>
			<td colspan="5" align="center"><a href="home">Click
			Here To Go to home</a></td>
		</tr>
</table>
</center>
</body>
</html>