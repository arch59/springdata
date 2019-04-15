<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Student Details</title>
</head>
<body>
	<center>
		<h1 style="color: #0066CC">Update Student Details</h1>
		<br /> <br />
		<form:form action="updateStudentDetails" method="post" modelAttribute="student">
			<table bgcolor="#DCDCDC">
				<tr>
					<td>Please Enter the Student Id:<span style="color: red;">*</span></td>
					<td><form:input path="studentId" required="required"/></td>
					<td style="color: red;"><form:errors path="studentId"></form:errors></td>
				<tr align="center">
					<td colspan="2"><input type="submit" name="submit"
						value="View"></input></td>
				</tr>
			</table>
		</form:form>
		<br> <a href="home">Back To Home</a>
	</center>
</body>
</html>