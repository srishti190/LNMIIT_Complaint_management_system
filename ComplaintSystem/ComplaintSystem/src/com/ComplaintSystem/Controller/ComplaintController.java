package com.ComplaintSystem.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ComplaintSystem.Dao.ComplaintPageDao;
import com.ComplaintSystem.Model.Applicant;

public class ComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  HttpSession session = request.getSession();
		  String username = (String) session.getAttribute("email");
		  Applicant user = ComplaintPageDao.getapplicantdetails(username);
		  request.setAttribute("name", user.getName());
		  request.setAttribute("phoneno",user.getPhoneno());
		  request.setAttribute("rollno", user.getRegisteration_id());
		  RequestDispatcher dispatcher = request.getRequestDispatcher("ComplaintPage.jsp");
	      dispatcher.forward(request, response);
	}
	
}
