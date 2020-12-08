<!DOCTYPE html>
<html>

<body bgcolor="powderblue">
<br><br><br>
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<a href="patient_home.html">Home</a> |
<a href="patient_profile.jsp">Profile</a> |
<a href="appointment.jsp">Appointment</a> |
<a href="index.html">Logout</a>
<br><br><br>
<%@page import="com.appolo.AppointmentBean,java.util.*" %>
<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Patient Name</td>
			<td>Phone</td>
			<td>Email</td>
			<td>Blood_group</td>
			<td>Specialist</td>
			<td>Date of appointment</td>
			<td>Time of appointment</td>
			<td>Doctor Name</td>
			<td>Status</td>
		</tr>
<%
int id=(Integer)session.getAttribute("id");
List<AppointmentBean> l=new AppointmentBean().status(id);
Iterator i=l.iterator();
while(i.hasNext()){
AppointmentBean ab=(AppointmentBean)i.next();
%>
<tr>
			<td><%=ab.getName() %></td>
			<td><%=ab.getPhone() %></td>
			<td><%=ab.getEmail() %></td>
			<td><%=ab.getBlood_group() %></td>
			<td><%=ab.getSpecialist() %></td>
			<td><%=ab.getDate_of_appointment() %></td>
			<td><%=ab.getTime_of_appointment() %></td>
			<td><%=ab.getStatus() %></td>
		</tr>


<%} %>
</table>
</body>
</html>