<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>University Enrollments</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Employees with Increased Salaries</h2>
	<table>
		<tr>
			<td>Employee Information</td><td>Increased Salary</td>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
			<td>${employee.personalInformation}</td>
			<td>${employee.increasedSalary}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
</body>
</html>