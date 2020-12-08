package com.appolo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DoctorRegisterBean {
	private int id;
	private String name;
	private String password;
	private String email;
	private long phone;
	private String specialisation;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public boolean register(String name, String password, String email, long phone,String specialisation) throws Exception {
		Connection con=Connect.Connectivity();
		String sql="insert into doctor(name,password,email,phone,specialisation) values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setLong(4, phone);
		ps.setString(5, specialisation);
		
		int a=ps.executeUpdate();
		if(a!=0)
			return true;
		else
			return false;
	}
}
