<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<title>Student Inquiry Form</title>
</head>
<body>
    
    <form:form action="/save-inquiry" modelAttribute="student" method="post">
    	<table>
    		<h2>Student Inquiry Form</h2>
    		<p><font color="green">${msg}</font></p>
    		<tr>
    			<td>Name:</td>
    			<td><form:input path="sName"/></td>
    		</tr>
    		
    		<tr>
    			<td>Email:</td>
    			<td><form:input path="sEmail"/></td>
    		</tr>
    		
    		<tr>
    			<td>Gender:</td>
    			<td>
    				<form:radiobutton path="sGender" value="M"/>Male
    				<form:radiobutton path="sGender" value="F"/>Female
    			</td>
    		</tr>
    		
    		<tr>
    			<td>Course:</td>
    			<td>
    				<form:select path="courseName">
    					<form:option value="">-Select-</form:option>
    					<form:options items="${courses}" />
    				</form:select>
    			</td>
    		</tr>
    		
    		<tr>
    			<td>Timings:</td>
    			<td>
    				<form:checkboxes items="${timings}" path="timings"/>
    			</td>
    		</tr>
    		
    		<tr>
    			<td></td>
    			<td>
    				<input type="submit" value="Submit"/>
    			</td>
    		</tr>
    		
    		
    	
    	</table>
    </form:form>
</body>
</html>