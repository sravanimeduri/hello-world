package com.organisation;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionEst {
	public static Connection connecitvity() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/office";
		String username = "root";
		String password = "root";
		return DriverManager.getConnection(url, username, password);
	}
}
