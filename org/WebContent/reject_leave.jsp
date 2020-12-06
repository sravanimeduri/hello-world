<%@include file="connect.jsp"%>
<% 
int id = Integer.parseInt(request.getParameter("id"));
String sql = "update leaves set status=? where id=?";
ps = con.prepareStatement(sql);
ps.setString(1, "Exceed the limitted leaves");
ps.setInt(2, id);
int x = ps.executeUpdate();
if (x != 0)
response.sendRedirect("view_leave.jsp?msg=rejected");


%>