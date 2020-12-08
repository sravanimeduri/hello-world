package com.appolo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AppointmentBean {
	private int id;
	private String name;
	private long phone;
	private String email;
	private String blood_group;
	private String specialist;
	private String date_of_appointment ;
	private String time_of_appointment ;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getDate_of_appointment() {
		return date_of_appointment;
	}
	public void setDate_of_appointment(String date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}
	public String getTime_of_appointment() {
		return time_of_appointment;
	}
	public void setTime_of_appointment(String time_of_appointment) {
		this.time_of_appointment = time_of_appointment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public boolean apply(String name, long phone, String email, String gender, String blood_group, String specialist,
			String date_of_appointment, String time_of_appointment,int id) throws Exception {
		Connection con=Connect.Connectivity();
			String sql = "insert into appointment(name,phone,email,gender,blood_group,specialist,date_of_appointment,time_of_appointment,id) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setLong(2, phone);
			ps.setString(3, email);
			ps.setString(4, blood_group);
			ps.setString(5, specialist);
			ps.setString(6, date_of_appointment);
			ps.setString(7, time_of_appointment);
			ps.setInt(9,id);
			int a = ps.executeUpdate();
			if (a != 0)
				return true;
			else
				return false;
		
	}
	public List<AppointmentBean> status(int id) throws Exception {
		Connection con=Connect.Connectivity();
		PreparedStatement ps=con.prepareStatement("select * from appointment where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		ArrayList<AppointmentBean> l=new ArrayList<>();
		while(rs.next()){
			AppointmentBean ab=new AppointmentBean();
			ab.setName(rs.getString(2));
			ab.setPhone(rs.getLong(3));
			ab.setEmail(rs.getString(4));
			ab.setBlood_group(rs.getString(5));
			ab.setSpecialist(rs.getString(7));
			ab.setDate_of_appointment(rs.getString(8));
			ab.setTime_of_appointment(rs.getString(9));
			ab.setName(rs.getString(10));
			ab.setStatus(rs.getString(11));
			l.add(ab);
		}
		return l;

}
}

