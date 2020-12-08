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
<%@include file="connect.jsp" %>
<table  border="2" width="600" height="300" cellpadding="20" >
<tr><td>Patient Name</td><td>Phone</td><td>Email</td><td>Gender</td><td>Blood group</td><td>Specialist</td>
<td>Date</td><td>Time</td><td>Status</td><td>Doctor Name</td></tr>
<% 

ps=con.prepareStatement("select * from appointment  ");

ResultSet rs=ps.executeQuery();
while(rs.next()) {
%>	
<tr>
<td><%=rs.getString(2) %></td>
<td><%=rs.getInt(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
<td><%=rs.getString(9) %></td>
<td><%=rs.getString(10) %></td>
<td><%=rs.getString(11) %></td>

</tr>


<%} %>
</table>
</body>
</html>