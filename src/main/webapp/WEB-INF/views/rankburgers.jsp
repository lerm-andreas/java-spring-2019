<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Ranked burgers</title>

    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>

</head>


<body>
<h2>List of ranked burgers</h2>
<table>
    <tr>
        <td>Burger name</td><td>Burger price</td>
    </tr>
    <c:forEach items="${burgersRanked}" var="burger">
        <tr>
            <td>${burger.name}</td>
            <td>${burger.price}</td>
        </tr>
    </c:forEach>
</table>
<br/>
</body>
</html>