package com.ComplaintSystem.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ComplaintSystem.Dao.ComplaintDao;
import com.ComplaintSystem.Dao.ComplaintPageDao;
import com.ComplaintSystem.Dto.ComplaintDetails;
import com.ComplaintSystem.Model.Complaint;


public class ComplaintListener extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		ComplaintDetails details = new ComplaintDetails();
	
		details.setComplaintDetails(request.getParameter("complaintdetails"));
		details.setComplaintTo(request.getParameter("complainto"));
		details.setComplaintType(request.getParameter("complainttype"));
		details.setDepartment(request.getParameter("department"));
		details.setLocation(request.getParameter("location"));
		details.setLocationSite(request.getParameter("locationsite"));
		details.setPreferreddatetime(request.getParameter("datepicker"), request.getParameter("appt"));
		details.setComplaint_id();
		details.setComplaint_date();
		String value=(String) session.getAttribute("email");
		details.setUsername(value);
		Boolean vs = ComplaintPageDao.filecomplaint(details);
		if(vs==true) {
			Boolean regist = ComplaintPageDao.fillregister(details);
			if(regist==true) {
				System.out.println("Done");
				ArrayList<Complaint> complaint = ComplaintDao.getcomplaints(details.getUsername());
	            request.setAttribute("ComplaintDetails", complaint);
				RequestDispatcher dispatcher = request.getRequestDispatcher("Complaint.jsp");
		        dispatcher.forward(request, response);
			}
			else {
				System.out.println("Not Done");
			}
			
		}
    }

}
