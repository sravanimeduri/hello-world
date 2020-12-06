package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Emp_Login")
public class Emp_Login extends HttpServlet {
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

		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		PrintWriter pw=response.getWriter();
		
		
	     try {
		ps=con.prepareStatement("select * from employee where email=? and password=?");
		ps.setString(1,email);
		ps.setString(2,password);
		HttpSession hs=request.getSession();
		
		pw.println("<html> <body bgcolor='navyblue'><center><h1>");
	   ResultSet x=ps.executeQuery();
	    if(x.next()) {
	    	hs.setAttribute("semail", email);
	    	hs.setAttribute("id", x.getInt(1));
	    	response.sendRedirect("./emp_profile.jsp?msg=registered");
	    }else
	    	pw.println("Logging Failed");
	     pw.println("</h1></center></body></html>");
	     
	     
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
