package com.vti.entity;

public class User {

	private int user_id;
	private String username;
	private String email;
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String username, String email, String password) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "user [user_id=" + user_id + ", username=" + username + ", email=" + email + ", password=" + password
				+ "]";
	}

}
