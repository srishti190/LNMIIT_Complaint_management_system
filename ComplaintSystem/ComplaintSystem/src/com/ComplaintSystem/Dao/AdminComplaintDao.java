package com.ComplaintSystem.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ComplaintSystem.Dto.AdminComplaintStatus;
import com.ComplaintSystem.Model.AdminComplaint;
import com.ComplaintSystem.utility.ConnectionFactory;

public class AdminComplaintDao{
	
    
    static Connection con = null;
    static Statement stmt=null;
    static Statement stmt1=null;
    static PreparedStatement preparedStmt=null;
    static ResultSet rs = null;
    static ResultSet rs1 = null;
    static ResultSet rs2 = null;
    
    
public static ArrayList<AdminComplaint> getadmincomplaints (String username) {
		
	     String query = "Select Distinct Department_id from department where Admin_id=(Select Admin_id from admin where Username ='"+username+"')";
	     ArrayList<AdminComplaint> details = new ArrayList<>();
         
	     try 
	      {
	    	 con = ConnectionFactory.getConnection();
	    	 stmt=con.createStatement();
	         rs = stmt.executeQuery(query);	
	         int department_id=0;
	         while(rs.next()) {
	        	 department_id = rs.getInt("Department_id");	 
	         }
	         if(department_id!=0) {
	        	 try {
        		     int i=1;
        		     String query1="Select * from complaint where Department_id= '"+department_id+"' and Complaint_status='Not resolved' ORDER BY Complaint_date,Preferred_datetime";
        		     rs1=stmt.executeQuery(query1);
        		     
        		     while(rs1.next()) {
        		    	 
        		    	 AdminComplaint value= new AdminComplaint();
        		    	 value.setSerial_no(i++);
        		    	 value.setComplaint_id(rs1.getInt("Complaint_id"));
        		    	 value.setComplaintdetails(rs1.getString("Complaint_details"));
        		    	 value.setLocation(rs1.getString("Location"));
        		    	 value.setPreferreddatetime(rs1.getString("Preferred_datetime"));
        		    	 value.setLocationsite(rs1.getString("Location_site"));
        		    	 value.setComplaint_type(rs1.getString("Complaint_type"));
        		    	 value.setComplaint_date(rs1.getString("Complaint_date"));
	        		     
        		    	 try {
        		    		 String query2="Select Name,Phone_no,Registeration_id from applicant where User_id='"+rs1.getInt("User_id")+"'";
        		    		 stmt1=con.createStatement();
        		    		 
                		     rs2=stmt1.executeQuery(query2);
                		     while(rs2.next()) {
                		    	   value.setPhoneno(rs2.getString("Phone_no"));
                		           value.setApplicantname(rs2.getString("Name"));
                		           value.setRegisteration_id(rs2.getString("Registeration_id"));
                		           } 
                		     details.add(value);
                		     
	        		    	 }
	        		     catch (Exception ex) 
	     			   	    {
	     			   	         System.out.println("Cannot Enter details of Applicant ");
	     			   	    } 
        		    	 finally 
        			      {
        			         if (stmt1 != null) {try { stmt1.close();} catch (Exception e) {} stmt1 = null;}
        				     if (rs2 != null)	{try {rs2.close();} catch (Exception e) {}rs2 = null; }
        			      }
        		    	 
        		    	 }
        		     return details;
        	  }
        	  catch (Exception ex) 
			   	    {
        		         ex.printStackTrace();
			   	         System.out.println("Some Exception Occured Cannot insert data into arraylist ");
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


public static Boolean changestatus(ArrayList<AdminComplaintStatus> complaintstatus) {
	
	 try {
		 
		 con = ConnectionFactory.getConnection();
		 for(int i=0;i<complaintstatus.size();i++) {
			  if(complaintstatus.get(i).getStatus().equals("Resolved")) {
				  
				  String query = "UPDATE complaint SET Complaint_status='Resolved' WHERE Complaint_id =?";
			      PreparedStatement preparedStmt = con.prepareStatement(query);
			      preparedStmt.setInt(1,complaintstatus.get(i).getComplaint_id());
			      preparedStmt.executeUpdate();	
			  }
			  
			}
		 return true;
	 }
	 catch (Exception ex) 
     {
        System.out.println("Log In failed: An Exception has occurred! " + ex);
        return false;
     } 
     finally 
     {
        if (rs != null){try { rs.close();} catch (Exception e) {} rs = null; }
	     if (preparedStmt != null) {try { preparedStmt.close();} catch (Exception e) {} preparedStmt = null;}
	     if (rs1 != null)	{try {rs1.close();} catch (Exception e) {}rs1 = null; }
     }
}

}