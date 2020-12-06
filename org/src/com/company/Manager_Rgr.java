package com.company;

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


@WebServlet("/Manager_Rgr")
public class Manager_Rgr extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	
    public void init(ServletConfig config) { 
    	try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	}catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	String url="jdbc:mysql://localhost:3306/jnit";
    	String username="root";
    	String password="root";
    	try {
    	con=DriverManager.getConnection(url,username,password);
    	} catch(SQLException e ) {
    		e.printStackTrace();
    	}
    	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String designation=request.getParameter("designation"); 
		String salary=request.getParameter("salary");
		double sal=Double.parseDouble(salary);
		String address=request.getParameter("address");
		PrintWriter pw=response.getWriter();
		
		try {	
			ps=con.prepareStatement("insert into manager(name,password,email,phone,desg,salary,address) values(?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3,email);
			ps.setLong(4,mobile);
			ps.setString(5, designation);
			ps.setDouble(6,sal);
			ps.setString(7,address);
			pw.println("<html> <body bgcolor='navyblue'><center><h1>");
		   int x=ps.executeUpdate();
		    if(x!=0)
		    	pw.println("Manager registerd Sucussfully");
		    else
		    	pw.println("Manager did'nt registerd ");
			
		     pw.println("</h1></center></body></html>");
		     
		     
			} catch(SQLException e) {
				e.printStackTrace();
			}	

	}

}
