<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employees List</title>
	</head>
	<body>
		<p><a href="search.htm">Search</a></p>
		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Salary</th>
			</tr>
			<c:forEach items="${empList}" var="emp">
				<tr>
					<td><c:out value="${emp.id}"/></td>
					<td><c:out value="${emp.name}"/></td>
					<td><c:out value="${emp.salary}"/></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>