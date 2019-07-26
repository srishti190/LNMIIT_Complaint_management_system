package com.ComplaintSystem.Model;

public class Admin extends User {

	     private int admin_id;
	     private int department_id;
	     private String contact_no;
		public int getAdmin_id() {
			return admin_id;
		}
		public void setAdmin_id(int admin_id) {
			this.admin_id = admin_id;
		}
		public int getDepartment_id() {
			return department_id;
		}
		public void setDepartment_id(int department_id) {
			this.department_id = department_id;
		}
		public String getContact_no() {
			return contact_no;
		}
		public void setContact_no(String contact_no) {
			this.contact_no = contact_no;
		}
	     
}
