<!DOCTYPE html>
<html>

<body bgcolor="navyblue">
<br><br><br>
<center><h1>Welcome to Employee Leave Page</h1></center>
<br><br>

<a href="emp_home.html">Home</a>|
<a href="emp_profile.jsp">Profile</a>|
<a href="leave.jsp">Apply Leave</a>|
<a href="leave_status.jsp">Leave Status</a>|
<a href="index.html">Logout</a> | 
<br><br><br>
<form action="./apply_leave.jsp" align="center">
<form action="./apply_leave.jsp"  align="center">
<input type="text" name="ename" placeholder="Enter name">
<input type="email" name="email" placeholder="Enter email">
<input type="number" name="phone" placeholder="Enter Phone number">
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<input type="number" name="no_of_days" placeholder="Enter no of days">
<input type="date" name="date_of_leave" placeholder="select date to leave">
<select name="designation">
<option value="Development">Development</option>
<option value="QA">QA</option>
<option value="HR">HR</option>
<option value="Sales">Sales</option>
</select>
<input type="submit" value="apply">
</form>

</body>
</html>