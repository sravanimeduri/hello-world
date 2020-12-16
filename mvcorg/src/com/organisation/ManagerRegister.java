package com.organisation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ManagerRegister")
public class ManagerRegister extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String mname=request.getParameter("mname");
			String password=request.getParameter("password");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			String gender=request.getParameter("gender");
			String address=request.getParameter("address");
			int experience=Integer.parseInt(request.getParameter("experience"));
			String designation=request.getParameter("designation");
			String sql="insert into manager(mname,password,email,phone,gender,address,experience,designation) values(?,?,?,?,?,?,?,?)";
			boolean status=false;
			try {
				status=new ManagerRegisterBean().register(mname, password, email, phone, gender, address, experience, designation);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(status)
				response.sendRedirect("./manager_login.html?msg=registered sucessfully");
			else
				response.sendRedirect("./manager_register.html?msg=register failed");
		}
		
	

}
