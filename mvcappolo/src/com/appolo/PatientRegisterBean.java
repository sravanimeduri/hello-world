package com.appolo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PatientRegisterBean {
	private int id;
	private String name;
	private String password;
	private String email;
	private long phone;
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
	public boolean register(String name, String password, String email, long phone) throws Exception {
		Connection con=Connect.Connectivity();
		String sql="insert into patient(name,password,email,phone) values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setLong(4, phone);
		int a=ps.executeUpdate();
		if(a!=0)
			return true;
		else
			return false;
	}	
}
