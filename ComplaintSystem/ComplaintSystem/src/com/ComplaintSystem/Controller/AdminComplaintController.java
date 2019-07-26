package com.ComplaintSystem.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ComplaintSystem.Dao.AdminComplaintDao;
import com.ComplaintSystem.Dto.AdminComplaintStatus;
import com.ComplaintSystem.Model.AdminComplaint;


public class AdminComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unchecked")
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		HttpSession session = request.getSession();
		ArrayList<AdminComplaint> complaints = new ArrayList<>();
		ArrayList<AdminComplaintStatus> complaintstatus = new ArrayList<>();
		complaints = (ArrayList<AdminComplaint>) session.getAttribute("ComplaintDetails");
		for(int i=0;i<complaints.size();i++) {
			AdminComplaintStatus value= new AdminComplaintStatus();
			String s = Integer.toString(complaints.get(i).getComplaint_id());
			value.setComplaint_id(complaints.get(i).getComplaint_id());
			value.setStatus(request.getParameter(s));
			complaintstatus.add(value);
		}
		Boolean result = AdminComplaintDao.changestatus(complaintstatus);
		if(result.booleanValue()==true) {
			String username = (String)session.getAttribute("email");
			ArrayList<AdminComplaint> complaint = AdminComplaintDao.getadmincomplaints(username);
            request.setAttribute("ComplaintDetails", complaint); 
            request.getRequestDispatcher("admin.jsp").forward(request, response); 
		}
	}
}
