<!DOCTYPE html>
<html>

<body bgcolor="navyblue">
<br><br><br>
<center><h1>Welcome to Employee Leave Page</h1></center>
<br><br>

<a href="emp_home.html">Home</a>|
<a href="emp_profile.jsp">Profile</a>|
<a href="leave.jsp">Apply Leave</a>|
<a href="leave_status.jsp">Leave Status</a>|
<a href="index.html">Logout</a> | 
<br><br><br>
<%@include file="connect.jsp"%>
<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Employee Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>No of days</td>
			<td>Date of leave</td>
			<td>Designation</td>
			<td>Manager Name</td>
			<td>Status</td>
			<td>Action</td>
		</tr>
<% 
int id=(Integer)session.getAttribute("id");
int no_of_leaves_taken=(Integer)session.getAttribute("leaves");
ps = con.prepareStatement("select * from leaves where eid=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getInt(4) %></td>
			<td><%=rs.getString(5) %></td>
			<td><%=rs.getInt(6) %></td>
			<td><%=rs.getString(7) %></td>
			<td><%=rs.getString(8) %></td>
			<td><%=rs.getString(9) %></td>
			<td><%=rs.getString(10) %></td>
			
			
			
			
		</tr>
		<%} %>
		
</table>
<br><br>
</body>
</html>
