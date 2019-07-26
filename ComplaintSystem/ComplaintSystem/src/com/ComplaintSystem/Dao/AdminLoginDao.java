package com.ComplaintSystem.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ComplaintSystem.Dto.LoginUser;
import com.ComplaintSystem.utility.ConnectionFactory;

public class AdminLoginDao{
	
    static Connection con = null;
    static Statement stmt=null;
    static ResultSet rs = null;
    
	public static boolean isValidUser(LoginUser user){
		
		String query = "Select * from admin where username ='" + user.getUsername() + "'and password = '" + user.getPassword() + "'";
		 try 
	      {
	         con = ConnectionFactory.getConnection();
	         stmt=con.createStatement();
	         rs = stmt.executeQuery(query);	        
	         
	         boolean validuser = rs.next();
	         if (!validuser) 
	         {
	            System.out.println("Sorry, you are not a registered admin! Please sign up first");
	            return false;
	         } 
		     //if user exists set the isValid variable to true
	         else if (validuser) 
	         {
	           return true;
	         }
	      }  
		 catch (Exception ex) 
	      {
	         System.out.println("Log In failed: An Exception has occurred! " + ex);
	         return false;
	      } 
	      finally 
	      {
	    	     if (rs != null){try { rs.close();} catch (Exception e) {} rs = null; }
			     if (stmt != null) {try { stmt.close();} catch (Exception e) {} stmt = null;}
			     
		  }
		return false;
		}
}
