<!DOCTYPE html>
<html>
<body bgcolor="lightgreen">
<br><br>
<center>
<h1>Welcome to Leave apply Page</h1>
<a href="./employee_home.html">Home</a> |
<a href="./employee_profile.jsp">Profile</a> |
<a href="leave.jsp">Leave Application</a> |
<a href="leave_status.jsp">Leave status</a> |
<a href="./index.html">logout</a>
</center>
<br><br>
<form action="./apply_leave" method="get" align="center">
<input type="text" name="ename" placeholder="Enter name">
<input type="email" name="email" placeholder="Enter email">
<input type="number" name="phone" placeholder="Enter Phone number">
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<input type="number" name="no_of_days" placeholder="Enter no of days">
<input type="date" name="date_of_leave" placeholder="select date to leave">
<select name="designation">
<option vlaue="Team Manger">Team Manager </option>
<option vlaue="Project Manger">Project Manager </option>
</select>
<input type="submit" value="apply">
</form>
</body>
</html>