<!DOCTYPE html>
<html>
<body bgcolor="powderblue">
<br><br><br>
<center><h1>WELCOME TO APPOINTMENT PAGE</h1></center>
<br><br><br>
<a href="patient_home.html">Home</a> |
<a href="patient_profile.jsp">Profile</a> |
<a href="appointment.jsp">Appointment</a> |
<a href="index.html">Logout</a>
<br><br><br>
<form action="apply_appointment.jsp" align="center">
<input  type="text" name="patient_name"  plaeholder="Enter patient name"> 
<input type="number" name="phone" placeholder="Enter phone number">
<input type="email"  name="email" placeholder="Enter email">
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<select name="blood_group">
<option value="A+">A+</option>
<option value="B+">B+</option>
<option value="B-">B-</option>
<option value="AB+">AB+</option>
<option value="AB-">AB-</option>
<option value="O+">O+</option>
<option value="O-">O-</option>
</select>
<select name="specialist">
<option value="DENTIST">DENTIST</option>
<option value="ENT">ENT</option>
<option value="CARDIAOLIGIST">CARDIAOLIGIST</option>
</select>
<input type="date" name="date_of_appointment" placeholder="select date ">
<input type="time" name="time_of_appointment" placeholder="select time ">
<input type="submit" value="apply"> 
</form> 
</body>
</html>

</form>
</body>
</html>
