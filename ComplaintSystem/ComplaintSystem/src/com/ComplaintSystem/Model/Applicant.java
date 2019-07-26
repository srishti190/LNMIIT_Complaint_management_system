package com.ComplaintSystem.Model;

public class Applicant extends User {

	private int applicant_id;
	private String phoneno;
	
	public String getPhoneno() {
		return phoneno;
	}
	public int getApplicant_id() {
		return applicant_id;
	}
	public void setApplicant_id(int applicant_id) {
		this.applicant_id = applicant_id;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
}
