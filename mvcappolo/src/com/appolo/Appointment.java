package com.appolo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Appointment")
public class Appointment extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname = request.getParameter("pname");
		long phone = Long.parseLong(request.getParameter("phone"));
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String blood_group = request.getParameter("blood_group");
		String specialist = request.getParameter("specialist");
		String date_of_appointment = request.getParameter("date_of_appointment");
		String time_of_appointment = request.getParameter("time_of_appointment");
		HttpSession hs=request.getSession();
		int pid=(Integer)hs.getAttribute("id");
		boolean status=false;
	}

}
