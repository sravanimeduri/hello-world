<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightgreen">
	<br>
	<br>
	<center>
		<h1>Welcome to Employee Profile Update Page</h1>
		<a href="./employee_home.html">Home</a> | 
		<a href="./employee_profile.jsp">Profile</a> | 
		<a href="./index.html">logout</a>
	</center>
	<br>
	<br>
	<%@page import="com.organisation.EmployeeRegisterBean"%>
	<%
	   EmployeeRegisterBean erb=(EmployeeRegisterBean)session.getAttribute("employeeDetails");
	if (erb!=null) {
	%>
	<form action="./employee_update" method="post" align="center">
	<input type="hidden" name="id" value="<%=erb.getEid()%>">
<input type="text" name="ename" value="<%=erb.getEname()%>">
<input type="email" name="email" value="<%=erb.getEmail()%>">
<input type="number" name="phone" value="<%=erb.getPhone()%>">
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<select name="designation">
<option value="<%=erb.getDesignation()%>"><%=erb.getDesignation()%></option>
<option value="Developer">Developer</option>
<option value="Tester">Tester</option>
</select><br><br>
<input type="number" name="experience" value="<%=erb.getExperience()%>"><br><br>
<textarea rows="15" cols="15" name="address"><%=erb.getAddress()%></textarea><br><br>
<input type="number" name="no_of_leaves_taken" value="<%=erb.getNo_of_leaves_taken()%>"><br><br>
<input type="submit" value="update">
	<%
		}
	%>
</body>
</html>