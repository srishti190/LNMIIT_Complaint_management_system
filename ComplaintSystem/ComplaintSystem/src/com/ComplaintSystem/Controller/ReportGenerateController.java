package com.ComplaintSystem.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ComplaintSystem.Dao.ReportDao;
import com.ComplaintSystem.Model.Register;

public class ReportGenerateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ArrayList<Register> report = new ArrayList<>();
		String email=(String) session.getAttribute("email");
		report = ReportDao.getreport(email);
		request.setAttribute("RegisterDetails", report);
        request.getRequestDispatcher("Report.jsp").forward(request, response); 
	}


}
