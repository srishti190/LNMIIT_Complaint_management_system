package com.ComplaintSystem.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.removeAttribute("name");
		session.removeAttribute("phoneno");
		session.removeAttribute("rollno");
		session.removeAttribute("ComplaintDetails");
		session.removeAttribute("DepartmentDetails");
		session.removeAttribute("email");
		if (session != null) {
		    session.invalidate();
		}
		RequestDispatcher dd = request.getRequestDispatcher("login.jsp");
        dd.forward(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
