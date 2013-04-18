<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert Employee</title>
	</head>
	<body>
		<form:form commandName="emp" method="post">
			<table>
				<tr>
					<td colspan="2" style="color: red">
						<form:errors/>
					</td>
				</tr>
				<tr>
					<td>Emp ID :</td>
					<td><form:input path="id"/></td>
				</tr>
				<tr>
					<td>Emp Name :</td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><form:input path="salary"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="insert"/>
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>