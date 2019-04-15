<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Student Management System</title>
</head>
<body>
<h1 align="center">Student Management System</h1>
<table align="center" border=1>
<tr><th>Pick Your Option</th></tr>
<tr><td><a href="addStudent">Add Student Details</a>
<tr><td><a href="viewAllStudent">View All Student Details</a>
<tr><td><a href="viewStudentById">View Student Details by Id</a>
<tr><td><a href="updateStudent">Update Student Details by Id</a>
<tr><td><a href="deleteStudent">Delete Student Details</a>
</table>
</body>
</html>