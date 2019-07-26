package com.ComplaintSystem.Dto;

import java.time.LocalDate;

public class ComplaintDetails {

	private static int c=2019;
	private int complaint_id;
	private String complaint_date;
	public String getComplaint_date() {
		return complaint_date;
	}
	public void setComplaint_date() {
		LocalDate localdate = java.time.LocalDate.now();
		String output = localdate.toString() ;
		this.complaint_date = output; 
	}
    private String department;
	private String complaintTo;
	private String complaintType;
	private String complaintDetails;
	private String location;
	private String locationSite;
	private String preferreddatetime;
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setComplaint_id(int complaint_id) {
		this.complaint_id = complaint_id;
	}

	public String getDepartment() {
		return department;
	}

	public String getComplaintTo() {
		return complaintTo;
	}

	public String getComplaintType() {
		return complaintType;
	}
	
	public String getComplaintDetails() {
		return complaintDetails;
	}	

	public int getComplaint_id() {
		return complaint_id;
	}

	public void setComplaint_id() {
		this.complaint_id =c++ ;
	}

	public String getLocationSite() {
		return locationSite;
	}

	public String getLocation() {
		return location;
	}
	
    public void setDepartment(String department) {
		this.department = department;
	}

	public void setComplaintTo(String complaintTo) {
		this.complaintTo = complaintTo;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	
	public void setComplaintDetails(String complaintDetails) {
		this.complaintDetails = complaintDetails;
	}	

	public void setLocationSite(String locationSite) {
		this.locationSite = locationSite;
	}

	public void setLocation(String location) {
		this.location = location;
	}
    
	public String getPreferreddatetime() {
		return preferreddatetime;
	}

	public void setPreferreddatetime(String date,String time) {
		this.preferreddatetime = dateAndTimeToDateTime(date,time);
	}

	public String dateAndTimeToDateTime(String date, String time) {
	    
		String myDate = date + " " + time +":00";
	    return myDate;
	}
	
}
