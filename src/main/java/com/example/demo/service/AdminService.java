package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Admin;

public interface AdminService  {
	
	// create 
	
	Admin createAdmin(Admin Admin);
	
	// delete
	
	void deleteAdmin(String user_id);
	
	// update
	
	Optional<Admin> updateAdmin(String user_id,Admin Admin);

}
