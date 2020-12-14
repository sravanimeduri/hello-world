package com.organisation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeRegister")
public class EmployeeRegister extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ename=request.getParameter("ename");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String designation=request.getParameter("designation");
		int experience=Integer.parseInt(request.getParameter("experience"));
		int no_of_leaves_taken=Integer.parseInt(request.getParameter("no_of_leaves_taken"));
		
		boolean status=false;
		try {
			status=new EmployeeRegisterBean().register(ename, password, email, phone, gender, designation, experience, no_of_leaves_taken, address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./employee_login.html?msg=registered sucessfully");
		else
			response.sendRedirect("./employee_register.html?msg=register failed");
	}

	

}
