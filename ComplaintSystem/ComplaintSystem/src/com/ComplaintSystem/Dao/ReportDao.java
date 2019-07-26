package com.ComplaintSystem.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ComplaintSystem.Model.Register;
import com.ComplaintSystem.utility.ConnectionFactory;

public class ReportDao {
	
	 static Connection con=null;
	 static ResultSet rs=null;
	 static Statement stmt=null;
	 static ResultSet rs1=null;
	 static Statement stmt1=null;
	 
public static ArrayList<Register> getreport(String email) {
				
		     ArrayList<Register> details = new ArrayList<>();
		     String query = "Select Distinct Department_id from department where Admin_id=(Select Admin_id from admin where Username ='"+email+"')";
					     
					     try 
					      {
					    	 con = ConnectionFactory.getConnection();
					    	 stmt=con.createStatement();
					         rs = stmt.executeQuery(query);	
					   		 int id=0;    
					         while(rs.next()) {
					   		    	 id=rs.getInt("Department_id");
					   		    }
					         if(id!=0) {
							        try 
								        {
							        	 String query1="Select * from registers where Department_id='"+id+"'";
								    	 stmt1=con.createStatement();
								         rs1 = stmt1.executeQuery(query1);	
								   		 int j=1;
								         while(rs1.next()) {
								        	 
								   		      Register regist = new Register();
								   		      regist.setSerial_id(j++);
								   		      regist.setComplaint_id(rs1.getInt("Complaint_id"));
								   		      regist.setUser_id(rs1.getInt("User_id"));
								   		      regist.setComplaintdetails(rs1.getString("Complaint_details"));
								   		      regist.setLocation(rs1.getString("Location"));
								   		      regist.setLocation_site(rs1.getString("Location_site"));
								   		      regist.setPhoneno(rs1.getString("Phone_no"));
								   		      regist.setDepartment_id(rs1.getInt("Department_id"));
								   		      regist.setPreferreddatetime(rs1.getString("Preferred_datetime"));
								   		   
								   		      details.add(regist);
								        	        
								              }
								             
								              return details;
								   	      }
								   	  
							              catch (Exception ex) 
										   	    {
										   	         System.out.println("Cannot Set attributes of user in complaint page ");
										   	         return details;
										   	    } 
										  finally 
										      {
										         if (rs1 != null){try { rs1.close();} catch (Exception e) {} rs1 = null; }
											     if (stmt1 != null) {try { stmt1.close();} catch (Exception e) {} stmt1 = null;}
											     
								               }
					          }
					     else {
					    	  System.out.println("Not Able to fetch department id");
					          }
					      }
					   	  catch (Exception ex) 
							   	    {
							   	         System.out.println("Cannot Set attributes of user in complaint page ");
							   	         return details;
							   	    } 
							  finally 
							      {
							         if (rs != null){try { rs.close();} catch (Exception e) {} rs = null; }
								     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
								     
							      }
						return details;
			}

public static ArrayList<Register> getresolvedreport(String email) {
	
	ArrayList<Register> details = new ArrayList<>();
    String query = "Select Distinct Department_id from department where Admin_id=(Select Admin_id from admin where Username ='"+email+"')";
			     
			     try 
			      {
			    	 con = ConnectionFactory.getConnection();
			    	 stmt=con.createStatement();
			         rs = stmt.executeQuery(query);	
			   		 int id=0;    
			         while(rs.next()) {
			   		    	 id=rs.getInt("Department_id");
			   		    }
			         if(id!=0) {
					        try 
						        {
					        	 String query1="Select * from complaint where Department_id='"+id+"' and Complaint_status='Resolved'";
						    	 stmt1=con.createStatement();
						         rs1 = stmt1.executeQuery(query1);	
						   		 
						         int j=1;
						         while(rs1.next()) {
						        	 
						   		      Register regist = new Register();
						   		      regist.setSerial_id(j++);
						   		      regist.setComplaint_id(rs1.getInt("Complaint_id"));
						   		       regist.setComplaintdetails(rs1.getString("Complaint_details"));
						   		      regist.setLocation(rs1.getString("Location"));
						   		      regist.setLocation_site(rs1.getString("Location_site"));
						   		      regist.setComplaint_status("Resolved");
						   		      regist.setPreferreddatetime(rs1.getString("Preferred_datetime"));
						   		      details.add(regist);
						        	        
						              }
						             
						              return details;
						   	      }
						   	  
					              catch (Exception ex) 
								   	    {
								   	         System.out.println("Cannot Set attributes of Resolved Complaint in complaint page ");
								   	         return details;
								   	    } 
								  finally 
								      {
								         if (rs1 != null){try { rs1.close();} catch (Exception e) {} rs1 = null; }
									     if (stmt1 != null) {try { stmt1.close();} catch (Exception e) {} stmt1 = null;}
									     
						               }
			          }
			     else {
			    	  System.out.println("Not Able to fetch department id");
			          }
			      }
			   	  catch (Exception ex) 
					   	    {
					   	         System.out.println("Cannot Set attributes of user in complaint page ");
					   	         return details;
					   	    } 
					  finally 
					      {
					         if (rs != null){try { rs.close();} catch (Exception e) {} rs = null; }
						     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
						     
					      }
				return details;
}

}
