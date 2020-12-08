package com.appolo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginBean {
	private String email,password;

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
	
	public DoctorRegisterBean loginValidate(String email,String password) throws SQLException, ClassNotFoundException {
		Connection con=Connect.Connectivity();
		PreparedStatement ps=con.prepareStatement("select * from doctor where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		DoctorRegisterBean rb=new DoctorRegisterBean();
		
		
			
			if(rs.next()) {
				rb.setId(rs.getInt("id"));
				rb.setName(rs.getString("name"));
				rb.setPassword(rs.getString("password"));
				rb.setEmail(rs.getString("email"));
				rb.setPhone(rs.getInt("phone"));
				
				rb.setSpecialisation(rs.getString("specialisation"));
				return rb;
			}else {
				return null;
			}
}
}
