package com.ComplaintSystem.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ComplaintSystem.Model.Complaint;
import com.ComplaintSystem.Model.Department;
import com.ComplaintSystem.utility.ConnectionFactory;

public class ComplaintDao{
	
    
    static Connection con = null;
    static Statement stmt=null;
    static Statement stmt1=null;
    static ResultSet rs = null;
    static ResultSet rs1 = null;
 
public static ArrayList<Complaint> getcomplaints (String username) {
		
	     String query = "Select * from applicant where Username ='"+username+"'";
	     ArrayList<Complaint> details = new ArrayList<>();
	     ArrayList<Department> departmentdetails = new ArrayList<>();
         departmentdetails=Departmentdao.getdepartmentdetails();
	     try 
	      {
	    	 con = ConnectionFactory.getConnection();
	    	 stmt=con.createStatement();
	         rs = stmt.executeQuery(query);	
	         int id=0;
	         while(rs.next()) {
	        	 id = rs.getInt("User_id");	 
	         }
	         if(id!=0) {
	        	  try {
	        		     int i=1;
	        		     String query1="Select * from complaint where User_id= '"+id+"'ORDER BY Preferred_datetime";
	        		     stmt1=con.createStatement();
	        		     rs1=stmt1.executeQuery(query1);
	        		     while(rs1.next()) {
	        		    	 
	        		    	 Complaint value= new Complaint();
	        		    	 value.setSerial_id(i++);
	        		    	 value.setComplaintId(rs1.getInt("Complaint_id"));
		    	          	 value.setComplaintType(rs1.getString("Complaint_type"));
		    	          	 value.setComplaintDetails(rs1.getString("Complaint_details"));
		    	          	 value.setPreferredDateTime(rs1.getString("Preferred_datetime"));
		    	          	 value.setstatus(rs1.getString("Complaint_status"));
				    	     for(int j=0;j<departmentdetails.size();j++) {
				    	    	 if(departmentdetails.get(j).getDepartment_id()==rs1.getInt("Department_id")) {
				    	    		 value.setdepartment(departmentdetails.get(j).getDepartment_name());
				    	    	 }
				    	     }
				    	      details.add(value);
				    	    }
	        		     return details;
	        	  }
	        	  catch (Exception ex) 
				   	    {
				   	         System.out.println("Some Exception Occured Cannot insert data into arraylist ");
				   	      System.out.println("hiii in 2");
				   	         return details;
				   	    } 
	         }
	         else {
	        	 System.out.println("user Doesn't have complaint");
	        	 return details;
	         }
	         
	       }  
		 catch (Exception ex) 
	      {
	         System.out.println("Log In failed: An Exception has occurred! " + ex);
	         return details;
	      } 
	      finally 
	      {
	    	     if (rs != null){try { rs.close();} catch (Exception e) {} rs = null; }
			     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
			     if (rs1 != null)	{try {rs1.close();} catch (Exception e) {}rs1 = null; }
			    
	      }
	}
}