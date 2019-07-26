package com.ComplaintSystem.Model;

public class Complaint {

	private String complaintType;
	private String complaintDetails;
	private int complaintId;
	private String status;
	private String department;
	private String preferredDateTime;
	private int serial_id;
	private int applicant_id;
	private String complaint_date;
	private String location;
	private String location_site;
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getApplicant_id() {
		return applicant_id;
	}

	public void setApplicant_id(int applicant_id) {
		this.applicant_id = applicant_id;
	}

	public String getComplaint_date() {
		return complaint_date;
	}

	public void setComplaint_date(String complaint_date) {
		this.complaint_date = complaint_date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation_site() {
		return location_site;
	}

	public void setLocation_site(String location_site) {
		this.location_site = location_site;
	}

	public int getSerial_id() {
		return serial_id;
	}

	public void setSerial_id(int serial_id) {
		this.serial_id = serial_id;
	}

	public String getComplaintType() {
		return complaintType;
	}
	
	public String getComplaintDetails() {
		return complaintDetails;
	}	

	public int getComplaintId() {
		return complaintId;
	}

	public String getdepartment() {
		return department;
	}

	public String getstatus() {
		return status;
	}
	
	public String getPreferredDateTime() {
		return preferredDateTime;
	}


	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	
	public void setComplaintDetails(String complaintDetails) {
		this.complaintDetails = complaintDetails;
	}	

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public void setdepartment(String department) {
		this.department = department;
	}

	public void setstatus(String status) {
		this.status = status;
	}
	
	public void setPreferredDateTime(String preferredDateTime) {
		this.preferredDateTime = preferredDateTime;
	}

}
