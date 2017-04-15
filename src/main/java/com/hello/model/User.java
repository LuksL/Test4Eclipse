package com.hello.model;

public class User {

	private String loginname;
	private String name;
	private String password;

	public User() {
		super();
	}


	public User(String loginname, String name, String password) {
		super();
		this.loginname = loginname;
		this.name = name;
		this.password = password;
	}


	public String getLoginname() {
		return loginname;
	}


	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
