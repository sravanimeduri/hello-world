<!DOCTYPE html>
<html>

<body bgcolor="powderblue">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<a href="doctor_home.html">Home</a> |
<a href="doctor_profile.jsp">Profile</a> |
<a href="view_appointment.jsp">Appointment Details</a> |
<a href="index.html">Logout</a>
<br><br><br>
<%@page import="com.appolo.DoctorRegisterBean" %>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Specialisation</td>
			<td>Action</td>
		</tr>
<%
DoctorRegisterBean rb=(DoctorRegisterBean) session.getAttribute("doctorDetails");
%>
<tr>
			<td><%=rb.getId()%></td>
			<td><%=rb.getName()%></td>
			<td><%=rb.getEmail()%></td>
			<td><%=rb.getPhone()%></td>			
			<td><%=rb.getSpecialisation()%></td>
			<td><a href="update_doctor_profile.jsp?id=<%=rb.getId()%>">update</a></td>
		</tr>
	</table>

</body>
</html>