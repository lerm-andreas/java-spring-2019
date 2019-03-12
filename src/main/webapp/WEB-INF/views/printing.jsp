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
<h2>List of Dummy models</h2>
<table>
    <tr>
        <td>Id</td>
        <td>col</td>
    </tr>
    <c:forEach items="${dummyModels}" var="dummy">
        <tr>
            <td>${dummy.id}</td>
            <td>${dummy.dummyCol}</td>
        </tr>
    </c:forEach>
</table>
<br/>
</body>
</html>