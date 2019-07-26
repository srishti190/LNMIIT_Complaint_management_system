package com.ComplaintSystem.Model;

public class User {

	private static int i=210;
	private int user_id; 
	private String name;
	private String registeration_id;
    private String username;
    private String password;
    public int getUser_id() {
		return user_id;
	}
	public void setUser_id() {
		this.user_id = i++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegisteration_id() {
		return registeration_id;
	}
	public void setRegisteration_id(String registeration_id) {
		this.registeration_id = registeration_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
