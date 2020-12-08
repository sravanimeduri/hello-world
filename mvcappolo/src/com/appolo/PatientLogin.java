package com.appolo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/PatientLogin")
public class PatientLogin extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		HttpSession hs=request.getSession();
		PatientRegisterBean prb=null;
		
		try {
			prb=new PatientLoginBean().login(email, password);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if(prb!=null) {
			hs.setAttribute("patientDetails", prb);
				hs.setAttribute("id", prb.getId());
				response.sendRedirect("./patient_home.html?msg=login sucessfully");
			}
			else
				response.sendRedirect("./patient_login.html?msg=login failed");
	}

}
