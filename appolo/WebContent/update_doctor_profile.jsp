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
<%@ page import="java.sql.*" %>
<%@include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from doctor where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
if(rs.next()) {
%>
<form action="./doctor_profile_update.jsp" align="center">
<input type="hidden" name="id" value="<%=rs.getInt("id")%>">
<input type="text" name="name" value="<%=rs.getString("name") %>">
<input type="email" name="email" value="<%=rs.getString("email") %>">
<input type="number" name="phone" value="<%=rs.getInt("phone") %>">
<select name="specialisation">
<option value="<%=rs.getString("specialisation")%>"><%=rs.getString("specialisation")%></option>
<option value="DENTIST">DENTIST</option>
<option value="ENT">ENT</option>
<option value="CARDIAOLIGIST">CARDIAOLIGIST</option>
</select>
<input type="submit" value="update">
</form>
<%}%>