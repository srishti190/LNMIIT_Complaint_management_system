package com.ComplaintSystem.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ComplaintSystem.Dao.Departmentdao;
import com.ComplaintSystem.Model.AdminDepartmentInfo;
import com.google.gson.Gson;


public class DepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  ArrayList<AdminDepartmentInfo> departmentdetails = Departmentdao.alldepartmentdetails(); 
		  String json = new Gson().toJson(departmentdetails);
    	  response.setContentType("application/json");
          response.setCharacterEncoding("UTF-8");
		  response.getWriter().write(json);
	}
}
