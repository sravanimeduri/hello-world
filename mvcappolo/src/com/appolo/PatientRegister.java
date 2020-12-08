package com.appolo;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.rmi.transport.Connection;


@WebServlet("/PatientRegister")
public class PatientRegister extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		long mobile = Long.parseLong(phone);
		boolean status = false;
		PatientRegisterBean prb = new PatientRegisterBean();
		prb.setName(name);
		prb.setPassword(password);
		prb.setEmail(email);
		prb.setPhone(mobile);
		try {
			status = prb.register(name, password, email, mobile);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if (status)
			response.sendRedirect("./patient_login.html?msg=registered sucessfully");
		else
			response.sendRedirect("./patient_register.html?msg=registered failed");
	}

}
