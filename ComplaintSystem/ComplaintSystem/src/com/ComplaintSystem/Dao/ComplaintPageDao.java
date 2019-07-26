package com.ComplaintSystem.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ComplaintSystem.Dto.ComplaintDetails;
import com.ComplaintSystem.Model.Applicant;
import com.ComplaintSystem.utility.ConnectionFactory;

public class ComplaintPageDao {
	    
	    static Connection con = null;
	    static PreparedStatement preparedStmt  = null;
	    static Statement stmt=null;
	    static ResultSet rs = null;
	    static ResultSet rs1 = null;
	    static ResultSet rs2 = null;

public static Applicant getapplicantdetails(String username) {
				
			     String query = "Select Name,Registeration_id,Phone_no from applicant where Username='"+username+"'";
			     Applicant user = new Applicant();
			     try 
			      {
			    	 con = ConnectionFactory.getConnection();
			    	 stmt=con.createStatement();
			         rs = stmt.executeQuery(query);	
		       		     while(rs.next()) {
		       		    	 user.setName(rs.getString("Name"));
		       		    	 user.setPhoneno(rs.getString("Phone_no"));
		       		    	 user.setRegisteration_id(rs.getString("Registeration_id"));
		       		    }
		       		     return user;
		       	  }
		       	  catch (Exception ex) 
					   	    {
					   	         System.out.println("Cannot Set attributes of user in complaint page ");
					   	         return user;
					   	    } 
					  finally 
					      {
					         if (rs != null){try { rs.close();} catch (Exception e) {} rs = null; }
						     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
						     
					      }
	}


public static Boolean filecomplaint(ComplaintDetails details) {
	
	String query = "INSERT INTO complaint (Complaint_id,User_id,Department_id,Complaint_type,Complaint_details,Complaint_date,Location,Location_site,Complaint_status,Preferred_datetime) VALUES (?,?,?,?,?,?,?,?,?,?)";
   
    try 
     {
   	 con = ConnectionFactory.getConnection();
     PreparedStatement preparedStmt = con.prepareStatement(query);
     preparedStmt.setInt (1,details.getComplaint_id());
         try 
			 { 
        	 int id=0;
        	 String query1="Select User_id from applicant where Username='"+details.getUsername()+"'";
		     stmt=con.createStatement();
		     rs1=stmt.executeQuery(query1);
		     while(rs1.next()) {
			     	id=rs1.getInt("User_id");
        	 }
		     preparedStmt.setInt(2,id);
		    }
		 catch (Exception ex) 
			{
		         System.out.println("Cannot Set User_Id  to complaint");
			} 
		 finally 
			 {
				         if (rs1 != null){try { rs1.close();} catch (Exception e) {} rs1 = null; }
					     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
					     
			 }
	     try 
		    { 
	    	 int deptid=0;
	    	 String query2="Select Distinct Department_id from department where Department_name='"+details.getDepartment()+"'";
		     stmt=con.createStatement();
		     rs1=stmt.executeQuery(query2);
		     while(rs1.next()) {
		    	 deptid=rs1.getInt("Department_id");
	    	 }
		     preparedStmt.setInt(3,deptid);
		    }
		 catch (Exception ex) 
			{
		         System.out.println("Cannot Set User_Id  to complaint");
			} 
		 finally 
			 {
				         if (rs1 != null){try { rs1.close();} catch (Exception e) {} rs1 = null; }
					     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
					     
			 }
         preparedStmt.setString(4,details.getComplaintType());
         preparedStmt.setString(5,details.getComplaintDetails());
         preparedStmt.setString(6,details.getComplaint_date());
         preparedStmt.setString(7,details.getLocation());
         preparedStmt.setString(8,details.getLocationSite());
         preparedStmt.setString(9,"Not resolved");
         preparedStmt.setString(10,details.getPreferreddatetime());
     // execute the preparedstatement
     preparedStmt.execute();
     return true;
  	  }
  	  catch (Exception ex) 
		   	    {
		   	         System.out.println("Cannot Execute Prepared Statement hiii");
	                  return false;
		   	    } 
		  finally 
		      {
		         if (rs != null){try { rs.close();} catch (Exception e) {} rs = null; }
			     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
			     
		      }
	
}


public static Boolean fillregister(ComplaintDetails details) {
	 
	String query = "INSERT INTO registers (User_id,Complaint_id,Complaint_details,Location,Preferred_datetime,Location_site,Phone_no,Department_id) VALUES (?,?,?,?,?,?,?,?)";
	   
    try 
     {
   	 con = ConnectionFactory.getConnection();
     PreparedStatement preparedStmt = con.prepareStatement(query);
         try 
			 { 
        	 int id=0;
        	 String Contact = null;
        	 String query1="Select User_id,Phone_no from applicant where Username='"+details.getUsername()+"'";
		     stmt=con.createStatement();
		     rs1=stmt.executeQuery(query1);
		     while(rs1.next()) {
			     	id=rs1.getInt("User_id");
			     	Contact =rs1.getString("Phone_no");
        	 }
		     preparedStmt.setInt(1,id);
		     preparedStmt.setInt(2,details.getComplaint_id());
		     preparedStmt.setString(7,Contact);
		    }
		 catch (Exception ex) 
			{
		         System.out.println("Cannot Set User_Id Phone no  to register");
			} 
		 finally 
			 {
				         if (rs1 != null){try { rs1.close();} catch (Exception e) {} rs1 = null; }
					     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
					     
			 }
	     try 
		    { 
	    	 int deptid=0;
	    	 String query2="Select Distinct Department_id from department where Department_name='"+details.getDepartment()+"'";
		     stmt=con.createStatement();
		     rs1=stmt.executeQuery(query2);
		     while(rs1.next()) {
		    	 deptid=rs1.getInt("Department_id");
	    	 }
		     preparedStmt.setInt(8,deptid);
		    }
		 catch (Exception ex) 
			{
		         System.out.println("Cannot Department_id  to department");
			} 
		 finally 
			 {
				         if (rs1 != null){try { rs1.close();} catch (Exception e) {} rs1 = null; }
					     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
					     
			 }
         preparedStmt.setString(3,details.getComplaintDetails());
         preparedStmt.setString(4,details.getLocation());
         preparedStmt.setString(5,details.getPreferreddatetime());
         preparedStmt.setString(6,details.getLocationSite());
       
     preparedStmt.execute();
     return true;
  	  }
  	  catch (Exception ex) 
		   	    {
		   	         System.out.println("Cannot Execute Prepared Statement");
	                  return false;
		   	    } 
		  finally 
		      {
		         if (rs != null){try { rs.close();} catch (Exception e) {} rs = null; }
			     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
			     
		      }
	
	
}
		


}
