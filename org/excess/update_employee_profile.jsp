<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>Welcome to Motivity </h1></center>
<br><br><br>
<a href="emp_Login.html">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/jnit";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from employee where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
if(rs.next()){
%>
<form action="./employee_profile_update.jsp"  align="center">
<input type="hidden" name="id" value="<%=rs.getInt("id")%>">
<input type="text" name="name" value="<%=rs.getString("name")%>">
<input type="email" name="email" value="<%=rs.getString("email")%>">
<input type="number" name="phone" value="<%=rs.getInt("phone")%>">
<select name="designation">
<option value="<%=rs.getString("designation")%>"><%=rs.getString("designation") %></option>
<option value="Development">Development</option>
<option value="QA">QA</option>
<option value="HR">HR</option>
<option value="sales">sales</option>
</select>
<input type="number" name="salary" value="<%=rs.getDouble("salary")%>">
<textarea  name="address" value="<%=rs.getString("address")%>"></textarea>
<input type="submit" value="Update">
</form>
<%}%>