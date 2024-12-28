package com.Login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "member")
public class Account {
	
	@Id
    @Column(name = "username")
	private String username;
	
	@NotBlank(message="password cannot be blank")
	@Column(name = "password")
	private String password;

	@NotBlank(message="name cannot be blank")
	@Column(name = "name")
	private String name;
	
	@NotBlank(message="phone cannot be blank")
	@Column(name = "phone")
	private String phone;
	
	@NotBlank(message="email cannot be blank")
	@Column(name = "email")
	private String email;
	
	
	public Account() {
		super();
	}


	public Account(String username, @NotBlank(message = "password cannot be blank") String password,
			@NotBlank(message = "name cannot be blank") String name,
			@NotBlank(message = "phone cannot be blank") String phone,
			@NotBlank(message = "email cannot be blank") String email) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	




	
	
}
