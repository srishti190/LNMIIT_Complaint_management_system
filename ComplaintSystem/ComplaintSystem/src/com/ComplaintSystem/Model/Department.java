package com.ComplaintSystem.Model;

public class Department {

	private String department_head;
	private int department_id;
	private int admin_id;
	private String department_name;
	private String issue_related;
	
	public String getDepartment_head() {
		return department_head;
	}
	public void setDepartment_head(String department_head) {
		this.department_head = department_head;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getIssue_related() {
		return issue_related;
	}
	public void setIssue_related(String issue_related) {
		this.issue_related = issue_related;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
}
