package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PatientRegister")
public class PatientRegister extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;			
public void init(ServletConfig config) { 
	    try {
	  	Class.forName("com.mysql.cj.jdbc.Driver");
	    }catch (ClassNotFoundException e) {
	    	e.printStackTrace(); }
	    	String url="jdbc:mysql://localhost:3306/kims";
	    	String username="root";
	    	String password="root";
	    	try {
	    	con=DriverManager.getConnection(url,username,password);
	    	} catch(SQLException e ) {
	    		e.printStackTrace(); }}	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
	String phonenumber=request.getParameter("phonenumber");
		long mobile=Long.parseLong(phonenumber);
		String problem=request.getParameter("problem");
			PrintWriter pw=response.getWriter();
	String sql="insert into patient(name,age,gender,phonenumber,email,password,address,problem) values(?,?,?,?,?,?,?,?)";
		try {	
		ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2,age);
		ps.setString(3,gender);
		ps.setString(4,phonenumber);
		ps.setString(5,email);
		ps.setString(6,password);
		ps.setString(7, address);
		ps.setString(8,problem);
		 int x=ps.executeUpdate();
	    if(x!=0)
	    	response.sendRedirect("./patient_login.html?msg=registered");
	     
		} catch(SQLException e) {
			e.printStackTrace();
		}		
	
	}

}
