<!DOCTYPE html>
<html>
<body bgcolor="navyblue">
<br><br><br>
<center><h1>Welcome to Motivity Employee Profile</h1></center>
<br><br><br>
<a href="emp_home.html">Home</a>|
<a href="emp_Login.html">Profile</a>|
<a href="leave.jsp">Leaves</a>|
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" align="center" width="400" height="400" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Designation</td><td>Action</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/jnit";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);
int id=(Integer)session.getAttribute("id");
ps=con.prepareStatement(" select * from employee where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt("id") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getInt("phone") %></td>
<td><%=rs.getString("designation") %></td>
<td><a href="update_emp_profile.jsp?id=<%=rs.getInt(1) %>">update</a></td>
</tr>
<%} %>
</table>
</body>
</html>