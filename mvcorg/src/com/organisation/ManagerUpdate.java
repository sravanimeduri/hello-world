package com.organisation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ManagerUpdate")
public class ManagerUpdate extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id=Integer.parseInt(request.getParameter("id"));
		String mname=request.getParameter("mname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		int experience=Integer.parseInt(request.getParameter("experience"));
		String designation=request.getParameter("designation");
		ManagerRegisterBean mrb=null;
		try {
			mrb=new ManagerUpdateBean().update(id, mname, email, phone, gender, address, experience, designation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession hs=request.getSession();
		if(mrb!=null) {
			hs.setAttribute("managerDetails", mrb);
			response.sendRedirect("./manager_profile.jsp?msg=updated sucessfully");
		}else
				response.sendRedirect("./update_manager_profile.jsp?id="+id+"msg=update failed");
	}

}
