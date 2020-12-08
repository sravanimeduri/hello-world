package com.appolo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AcceptBean {
	public String name;
	public String status;
	public int aid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public boolean accept(String dname, int aid) throws Exception {
		Connection con=Connect.Connectivity();
		String sql = "update appointment set status=?,name=? where aid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "Accepted");
		ps.setString(2, name);
		ps.setInt(3, aid);
		int a = ps.executeUpdate();
		if(a!=0)
			return true;
		else
			return false;
	}
}
