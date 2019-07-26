package com.ComplaintSystem.Model;

public class Register {

	 private int serial_id;
	 private int user_id;
	 private int department_id;
	 private int complaint_id;
	 private String complaintdetails;
	 private String location;
	 private String preferreddatetime;
	 private String location_site;
	 private String phoneno;
	 private String complaint_status;
	
	public String getComplaint_status() {
		return complaint_status;
	}
	public void setComplaint_status(String complaint_status) {
		this.complaint_status = complaint_status;
	}
	public int getSerial_id() {
		return serial_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getComplaint_id() {
		return complaint_id;
	}
	public void setComplaint_id(int complaint_id) {
		this.complaint_id = complaint_id;
	}
	public String getComplaintdetails() {
		return complaintdetails;
	}
	public void setComplaintdetails(String complaintdetails) {
		this.complaintdetails = complaintdetails;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPreferreddatetime() {
		return preferreddatetime;
	}
	public void setPreferreddatetime(String preferreddatetime) {
		this.preferreddatetime = preferreddatetime;
	}
	public String getLocation_site() {
		return location_site;
	}
	public void setLocation_site(String location_site) {
		this.location_site = location_site;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public void setSerial_id(int j) {
		this.serial_id=j;
	}
	 
}
