package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="Admin")

public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long admin_id;
	
	@Column(name="Admin_name")
	private String name;
	
	@Column(name="Admin_mobile")
	private long mobile;
	
	@Column(name="Admin_user_id")
	private String user_id;
	
	@Column(name="Admin_pass")
	private String pass;
	
	@Column(name="Admin_email")
	private String email;

	public long getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(long admin_id) {
		this.admin_id = admin_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Admin(long admin_id, String name, long mobile, String user_id, String pass, String email) {
		super();
		this.admin_id = admin_id;
		this.name = name;
		this.mobile = mobile;
		this.user_id = user_id;
		this.pass = pass;
		this.email = email;
	}


	
	public Admin() {}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", name=" + name + ", mobile=" + mobile + ", user_id=" + user_id
				+ ", pass=" + pass + ", email=" + email + "]";
	}
	
	
	
}
