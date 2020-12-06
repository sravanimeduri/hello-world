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
String name=request.getParameter("name");
String email=request.getParameter("email");
long phone=Long.parseLong(request.getParameter("phone"));
String designation=request.getParameter("designation");
double salary=Double.parseDouble(request.getParameter("salary"));
String address=request.getParameter("address");
ps=con.prepareStatement("update employee set name=?,email=?,phone=?,designation=?,salary=?,address=? where id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setLong(3,phone);
ps.setString(4,designation);
ps.setDouble(5,salary);
ps.setString(6,address);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("emp_profile.jsp?msg=updated");
%>
