<!DOCTYPE html>
<html>
<body bgcolor="navyblue">
<br><br><br>
<center><h1>Welcome to Motivity Leave Page</h1></center>
<br><br><br>
<a href="manager_home.html">Home</a>|
<a href="manager_Login.html">Profile</a>|
<a href="view_leave.jsp">View Leaves</a>|
<a href="index.html">Logout</a>
<br><br><br>
<%@include file="connect.jsp" %>
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
String designation=(String) session.getAttribute("designation");
ps=con.prepareStatement("select * from leaves where designation=?");
ps.setString(1,designation);
ResultSet rs=ps.executeQuery();
while(rs.next()){
	int id=rs.getInt(11);
	ps=con.prepareStatement("select * from employee where eid=?");
	ps.setInt(1,id);
	ResultSet rs1=ps.executeQuery();
	if(rs1.next()){
		int no_of_leaves_taken=rs1.getInt("no_of_leaves_taken"),eid=rs1.getInt(1);
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
			
			<%if(rs.getInt(6)<20-no_of_leaves_taken){
				if(rs.getString(9).equalsIgnoreCase("Accepted")){ %>
			<td>Accepted</td>
			<%}else{ %>
			<td><a href="accept_leave.jsp?id=<%=rs.getInt(1)%>&eid=<%=eid %>&no_of_days=<%=rs.getInt(6)%>">Accept</a></td>
			<%}
				}else{ %>
					<td><a href="reject_leave.jsp?id=<%=rs.getInt(1)%>">Reject</a></td>
				<%} %>
			
			
		</tr>
		<%} } %>
		
</table>
<br><br>
</body>
</html>