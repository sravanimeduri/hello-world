package com.organisation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ManagerLogin")
public class ManagerLogin extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	
		String password=request.getParameter("password");
		String email=request.getParameter("email");
			ManagerRegisterBean mrb=null;
			try {
				mrb = new ManagerLoginBean().login(email, password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession hs=request.getSession();
			if(mrb!=null) {
				hs.setAttribute("managerDetails", mrb);
				hs.setAttribute("id", mrb.getMid());
				hs.setAttribute("designation", mrb.getDesignation());
				hs.setAttribute("mname",mrb.getMname());
				response.sendRedirect("./manager_home.html?msg=login sucessfully");
			}
			else
				response.sendRedirect("./manager_login.html?msg=login failed");
		
	}

}
