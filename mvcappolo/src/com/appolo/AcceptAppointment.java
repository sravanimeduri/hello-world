package com.appolo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AcceptAppointment")
public class AcceptAppointment extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		String dname=(String) hs.getAttribute("name");
		int aid=Integer.parseInt(request.getParameter("id"));
		boolean status=false;
		
		try {
			status=new AcceptBean().accept(dname , aid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("view_appointment.jsp?msg=accepted");
	
	}

}
