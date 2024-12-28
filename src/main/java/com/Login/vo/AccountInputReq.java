package com.Login.vo;

import javax.validation.constraints.NotBlank;

import com.Login.entity.Account;


public class AccountInputReq{
	
	private String username;
	private String password;
	
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
