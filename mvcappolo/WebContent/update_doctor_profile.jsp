<!DOCTYPE html>
<html>
<body bgcolor="powderblue">
<br><br><br>        
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<a href="doctor_home.html">Home</a> |
<a href="doctor_profile.jsp">Profile</a> |
<a href="index.html">Logout</a>
<br><br><br>
<%@page import="com.appolo.DoctorRegisterBean" %>
<%
		DoctorRegisterBean rb=(DoctorRegisterBean)session.getAttribute("doctorDetails");
		if (rb!=null) {
	%>
<form action="./doctor_update" method="post" align="center">
		<input type="hidden" name="id" value="<%=rb.getId()%>">
		<input type="text" name="dname" value="<%=rb.getName()%>">
		<input type="email" name="email"
			value="<%=rb.getEmail()%>"><br> <br> <input
			type="number" name="phone" value="<%=rb.getPhone()%>">
		<select name="specialization">
		 	<option value="<%=rb.getSpecialisation()%>"><%=rb.getSpecialisation()%></option>
			<option value="Dentist">Dentist</option>
			<option value="Cardio">Cardio</option>
			<option value="ENT">ENT</option>
		</select>
		 <input type="submit" value="update">
	</form>
<%}%>
</body>
</html>