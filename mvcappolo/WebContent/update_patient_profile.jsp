<!DOCTYPE html>
<html>
<body bgcolor="powderblue">
<br><br><br>        
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<a href="patient_home.html">Home</a> |
<a href="patient_profile.jsp">Profile</a> |
<a href="index.html">Logout</a>
<br><br><br>
<%@page import="com.appolo.PatientRegisterBean" %>
<%
	PatientRegisterBean prb=(PatientRegisterBean)session.getAttribute("patientDetails");
	if (prb!=null) {
	%>
<form action="./patient_update" method="post" align="center">
		<input type="hidden" name="id" value="<%=prb.getId()%>">
		<input type="text" name="pname" value="<%=prb.getName()%>"><br>
		<br> <input type="email" name="email" value="<%=prb.getEmail()%>"><br> <br> 
		<input type="number" name="phone" value="<%=prb.getPhone()%>"><br>
		<br> <br> <input type="submit" value="update">
	</form>
<%}%>

</body>
</html>