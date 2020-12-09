package com.organisation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeLoginBean {
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public EmployeeRegisterBean login(String email, String password) throws Exception {
		Connection con=ConnectionEst.connecitvity();
		String sql="select * from employee where email=? and password = ?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		EmployeeRegisterBean erb=new EmployeeRegisterBean();
		return erb;
	}
}
