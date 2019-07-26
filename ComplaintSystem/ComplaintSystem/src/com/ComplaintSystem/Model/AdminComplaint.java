package com.ComplaintSystem.Model;

public class AdminComplaint {

	 private int serial_no;
	 private String applicantname;
	 private String registeration_id;
	 private int complaint_id;
	 private String complaint_type;
	 private String complaint_date;
	 private String complaintdetails;
	 private String location;
	 private String locationsite;
	 private String preferreddatetime;
	 private String phoneno;
	 public String getComplaint_type() {
			return complaint_type;
		}
		public void setComplaint_type(String complaint_type) {
			this.complaint_type = complaint_type;
		}
		public String getComplaint_date() {
			return complaint_date;
		}
		public void setComplaint_date(String complaint_date) {
			this.complaint_date = complaint_date;
		}
	 public String getRegisteration_id() {
			return registeration_id;
		}
		public void setRegisteration_id(String registeration_id) {
			this.registeration_id = registeration_id;
		}
	public int getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}
	public String getApplicantname() {
		return applicantname;
	}
	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
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
	public String getLocationsite() {
		return locationsite;
	}
	public void setLocationsite(String locationsite) {
		this.locationsite = locationsite;
	}
	public String getPreferreddatetime() {
		return preferreddatetime;
	}
	public void setPreferreddatetime(String preferreddatetime) {
		this.preferreddatetime = preferreddatetime;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	 
	 
	 
}
