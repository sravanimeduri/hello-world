package com.appolo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	LoginBean lb=new LoginBean();
	lb.setEmail(email);
	lb.setPassword(password);
	HttpSession hs=request.getSession();
	hs.setAttribute("bean",lb);
	PrintWriter pw=response.getWriter();
	boolean status=false;
	
	DoctorRegisterBean rb=null;
	try {
		rb = new LoginBean().loginValidate(email,password);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(rb!=null) {
	    hs.setAttribute("doctorDetails", rb);
		hs.setAttribute("id",  rb.getId());
		hs.setAttribute("name", rb.getName());
		hs.setAttribute("specialist",rb.getSpecialisation());
		response.sendRedirect("./doctor_home.html?msg=login sucessfully");
	}
	else
		response.sendRedirect("./doctor_login.html?msg=login failed");
	
}

}
