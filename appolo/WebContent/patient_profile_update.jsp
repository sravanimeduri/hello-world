<%@ page import="java.sql.*" %>
<%@include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
Long phonenumber=Long.parseLong(request.getParameter("phonenumber"));
String address=request.getParameter("address");
String gender=request.getParameter("gender");
int age=Integer.parseInt(request.getParameter("age"));
ps=con.prepareStatement("update patient set name=?,email=?,phonenumber=?,gender=?,address=?,age=? where id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setLong(3,phonenumber);
ps.setString(4,gender);
ps.setString(5,address);
ps.setInt(6,age);
ps.setInt(7,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("patient_profile.jsp?msg=Updated");
%>