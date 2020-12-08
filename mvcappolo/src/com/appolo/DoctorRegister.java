package com.appolo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DoctorRegister")
public class DoctorRegister extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String specialisation=request.getParameter("specialisation");
		boolean status=false;
		DoctorRegisterBean rb=new DoctorRegisterBean();
		rb.setName(name);
		rb.setPassword(password);
		rb.setEmail(email);
		rb.setPhone(mobile);
		rb.setSpecialisation(specialisation);
		try {
			status=rb.register(name, password, email, mobile, specialisation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./doctor_login.html?msg=registered sucessfully");
		else
			response.sendRedirect("./doctor_register.html?msg=registered failed");
	}

}
