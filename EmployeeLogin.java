package com.organisation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		EmployeeRegisterBean erb=null;
		try {
			erb=new EmployeeLoginBean().login(email, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			HttpSession hs=request.getSession();
			if(erb!=null) {
				hs.setAttribute("employeeDetails", erb);
				hs.setAttribute("id", erb.getEid());
				hs.setAttribute("leaves", erb.getNo_of_leaves_taken());
				response.sendRedirect("./employee_home.html?msg=login sucessfully");
			}
			else
				response.sendRedirect("./employee_login.html?msg=login failed");
	}

}
