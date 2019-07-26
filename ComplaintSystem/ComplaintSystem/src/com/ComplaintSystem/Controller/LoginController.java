package com.ComplaintSystem.Controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ComplaintSystem.Dao.ApplicantLoginDao;
import com.ComplaintSystem.Dao.ComplaintDao;
import com.ComplaintSystem.Dto.LoginUser;
import com.ComplaintSystem.Model.Complaint;

public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		    LoginUser user=new LoginUser();
		    user.setUsername(request.getParameter("username"));
		    user.setPassword(request.getParameter("password"));
		    
		    try {
			
		    Boolean isValidUser = ApplicantLoginDao.isValidUser(user);
            System.out.println(isValidUser);
            
			if(isValidUser)
            {
				System.out.println("User Login Successful");
				HttpSession session = request.getSession();
                session.setAttribute("email", user.getUsername());
                ArrayList<Complaint> complaint = ComplaintDao.getcomplaints(user.getUsername());
               
                request.setAttribute("ComplaintDetails", complaint);
                request.getRequestDispatcher("Complaint.jsp").forward(request, response); 
            }
            else
            {
            	System.out.println("User Login Unsuccessful");
            	request.setAttribute("msg","Username Or Password Incorrect");
                request.getRequestDispatcher("login.jsp").forward(request, response); 
            }
			
            }catch (Exception e) {
				
			}
	}
}
		
