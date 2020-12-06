<!DOCTYPE html>
<html>
<body bgcolor="navyblue">
<br><br><br>
<center><h1>Welcome to Manager Profile Page</h1></center>
<br><br><br>
<a href="manager_home.html">Home</a>|
<a href="manager_Login.html">Profile</a>|
<a href="view_leave.jsp">View Leaves</a>|
<a href="index.html">Logout</a>
<br><br><br>
<%@ include file="connect.jsp" %>
<table border="2" align="center" width="400" height="400" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Designation</td><td>Action</td></tr>
<%
int id=(Integer)session.getAttribute("id");
ps=con.prepareStatement(" select * from manager where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt("id") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getInt("phone") %></td>
<td><%=rs.getString("desg") %></td>
<td><a href="update_emp_profile.jsp?id=<%=rs.getInt(1) %>">update</a></td>
</tr>
<%} %>
</table>
</body>
</html>