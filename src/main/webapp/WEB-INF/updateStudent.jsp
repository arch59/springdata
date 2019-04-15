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
	<h1 align="center">Student Details to Update</h1>
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
			<td><c:out value="${student.studentId}" /></td>
			<td><c:out value="${student.studentName}" /></td>
			<td><c:out value="${student.studentMobile}" /></td>
			<td><c:out value="${student.studentCollege}" /></td>
			<td><c:out value="${student.studentDomain}" /></td>
			<td><c:out value="${student.studentCity}" /></td>
		</tr>
	</table>
	<br />
	<br />
	<form:form action="updateStudentSuccess" modelAttribute="student">
		<table bgcolor="#DCDCDC">
			<tr>
				<td>Student Id:<span style="color: red;">*</span></td>
				<td><form:input path="studentId" required="required" pattern="[1-9]{1}[0-9]{5}" title="Id Should be 6 digits"/></td>
				<td style="color: red;"><form:errors path="studentId"></form:errors></td>
			</tr>
			<tr>
				<td>Student Name:<span style="color: red;">*</span></td>
				<td><form:input path="studentName" required="required"/></td>
				<td style="color: red;"><form:errors path="studentName"></form:errors></td>
			</tr>

			<tr>
				<td>Student Mobile:<span style="color: red;">*</span></td>
				<td><form:input path="studentMobile" required="required"  pattern="[7-9]{1}[0-9]{9}" title="Mobile Number should be 10 digits"/></td>
				<td style="color: red;"><form:errors path="studentMobile"></form:errors></td>
			</tr>

			<tr>
				<td>Student City:<span style="color: red;">*</span></td>
				<td><form:input path="studentCity" required="required"/></td>
				<td style="color: red;"><form:errors path="studentCity"></form:errors></td>
			</tr>
			<tr>
				<td>Student College:<span style="color: red;">*</span></td>
				<td><form:input path="studentCollege" required="required"/></td>
				<td style="color: red;"><form:errors path="studentCollege"></form:errors></td>
			</tr>

			<tr>
				<td>Student Domain:<span style="color: red;">*</span></td>
				<td><form:select path="studentDomain">
						<form:option value="CS" />CS <form:option value="ECE" />ECE <form:option
							value="EEE" />EEE <form:option value="IS" />IS </form:select></td>
				<td style="color: red;"><form:errors path="studentDomain"></form:errors></td>
			</tr>

		</table>
		<tr>
			<td></td>
			<td><input type="submit" value="Update Details"></td>
		</tr>
	</form:form>
</body>
</html>