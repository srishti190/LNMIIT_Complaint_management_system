package com.ComplaintSystem.Controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ComplaintSystem.Dao.AdminComplaintDao;
import com.ComplaintSystem.Dao.AdminLoginDao;
import com.ComplaintSystem.Dto.LoginUser;
import com.ComplaintSystem.Model.AdminComplaint;

public class AdminController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("AdminLogin.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		    LoginUser user=new LoginUser();
		    user.setUsername(request.getParameter("username"));
		    user.setPassword(request.getParameter("password"));
		    
		    try {
				
			Boolean isValidUser = AdminLoginDao.isValidUser(user);
            System.out.println(isValidUser);
			if(isValidUser)
            {
				System.out.println("Admin Login Successful");
				HttpSession session = request.getSession();
                session.setAttribute("email", user.getUsername());
                ArrayList<AdminComplaint> complaint = AdminComplaintDao.getadmincomplaints(user.getUsername());
                System.out.println(complaint);
                session.setAttribute("ComplaintDetails", complaint);
                request.setAttribute("ComplaintDetails", complaint);
                request.getRequestDispatcher("admin.jsp").forward(request, response); 
            }
            else
            {
            	System.out.println("Admin login unsuccessful");
            	request.setAttribute("msg", "Enter Username Or Password Incorrect" );
            	request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
            	
            }
            }catch (Exception e) {
				
			}
	}
}
		