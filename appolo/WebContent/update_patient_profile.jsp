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
<%@ page import="java.sql.*" %>
<%@include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from patient where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
if(rs.next()) {
%>
<form action="./patient_profile_update.jsp" align="center">
<input type="hidden" name="id" value="<%=rs.getInt("id")%>">
<input type="text" name="name" value="<%=rs.getString("name") %>">
<input type="email" name="email" value="<%=rs.getString("email") %>">
<input type="number" name="phone" value="<%=rs.getInt("phone") %>">
<input type="text" name="address" value="<%=rs.getString("address")%>">
<input type="text" name="gender" value="<%=rs.getString("gender")%>">
<select name="problem">
<option value="<%=rs.getString("problem")%>"><%=rs.getString("problem") %></option>
<option value="teeth ">teeth pain</option>
<option value="Eye ">Eye related issue</option>
<option value="chest">chest pain</option>
</select>
<input type="submit" value="update">
</form>
<%}%>

</body>
</html>