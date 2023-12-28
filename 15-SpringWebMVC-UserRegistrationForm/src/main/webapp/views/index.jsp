<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<meta charset="UTF-8">
<title>User Registration Form</title>
<style>

</style>
</head>
<body>
	
	<form:form action="/register" modelAttribute="users" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td>
					<form:input path="name"/>
<%-- 					<form:errors path="name" cssClass="errors"/> --%>
				</td>
			</tr>
			
			<tr>
				<td>Email:</td>
				<td>
					<form:input path="email"/>
<%-- 					<form:errors path="email" cssClass="errors"/> --%>
				</td>
			</tr>
			
			<tr>
				<td>Username:</td>
				<td>
					<form:input path="userName"/>
					<form:errors path="userName"/>
				</td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td>
					<form:password path="password"/>
<%-- 					<form:errors path="password" cssClass="errors"/> --%>
				</td>
			</tr>
			
			<tr>
				<td><h2><font color="green">${msg}</font></h2></td>
				<td>
					<input type="submit" value="Register">
				</td>
			</tr>
		</table>
	</form:form>
	
	
</body>
</html>