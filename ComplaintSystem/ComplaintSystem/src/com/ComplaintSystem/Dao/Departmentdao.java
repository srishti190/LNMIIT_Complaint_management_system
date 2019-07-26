package com.ComplaintSystem.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ComplaintSystem.Model.AdminDepartmentInfo;
import com.ComplaintSystem.Model.Department;
import com.ComplaintSystem.utility.ConnectionFactory;

public class Departmentdao {
 
	 static Statement stmt1=null;
	 static Statement stmt=null;
	 static Connection con = null;
	 static ResultSet rs2= null;
	 static ResultSet rs= null;
	
	public static ArrayList<Department> getdepartmentdetails(){
	ArrayList<Department> departmentdetails = new ArrayList<>(); 
    
    try {
    	     String query2="Select DISTINCT Department_id,Department_name from department" ;
    	     con = ConnectionFactory.getConnection();
             stmt1=con.createStatement();
		     
		     rs2=stmt1.executeQuery(query2);
		     while(rs2.next()) {
		    	 Department department = new Department();
		    	 department.setDepartment_id(rs2.getInt("Department_id"));
		    	 department.setDepartment_name(rs2.getString("Department_name"));
		    	 departmentdetails.add(department);
		    	}
		     }
	 catch (Exception ex) 
  	    {
		     ex.printStackTrace();
		     System.out.println(ex);
  	         System.out.println("Some Exception Occured Cannot Find Department data ");
  	    }
    finally 
    {
  	     if (rs2 != null){try { rs2.close();} catch (Exception e) {} rs2 = null; }
		     if (stmt1 != null) {try { stmt1.close();} catch (Exception e) {} stmt1 = null;}
		     
		    
    }
    
	return departmentdetails;
	}
	
public static ArrayList<AdminDepartmentInfo> alldepartmentdetails() {
		
        String query = "Select Department_name,Department_head,Complaint_type from department ";
	     ArrayList<AdminDepartmentInfo> details = new ArrayList<>();
	     try 
	      {
	    	 con = ConnectionFactory.getConnection();
	    	 stmt=con.createStatement();
	         rs = stmt.executeQuery(query);	
       		     while(rs.next()) {
       		    	 
       		    	 AdminDepartmentInfo value= new AdminDepartmentInfo();
       		    	 value.setComplainttype(rs.getString("Complaint_type"));
       		    	 value.setDepartmenthead(rs.getString("Department_head"));
       		    	 value.setDepartmentname(rs.getString("Department_name"));
       		    	 details.add(value);
       		        }
       		     return details;
       	  }
       	  catch (Exception ex) 
			   	    {
			   	         System.out.println("Cannot Insert in AdminDepartment Info for Drop Down Values ");
			   	         return details;
			   	    } 
			  finally 
			      {
			         if (rs != null){try { rs.close();} catch (Exception e) {} rs = null; }
				     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
				    
			      }
	}
}
