package com.example.demo.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.AdminRepository;

import com.example.demo.entity.Admin;

@Service

public class AdminServiceImp implements AdminService {
	
	@Autowired
	public AdminRepository AdminRepository;
	@Override
	public Admin createAdmin(Admin Admin) {
		return AdminRepository.save(Admin);
	}
	
	

	@Override
	public void deleteAdmin(String user_id) {
//	    AdminRepository.delete(Admin,user_id );
	}




	@Override
	 public Optional<Admin> updateAdmin(String user_id, Admin Admin){
//       Optional<Student> existingAdmin= AdminRepository.findById(user_id);
//       
//       if (existingAdmin.isPresent()) {
//           Student updatedAdmin = existingAdmin.get();
//           updatedAdmin.setName(Admin.getName());  
//           updatedAdmin.setmobile(student.getDept_id());
//           updatedAdmin.setBatch(student.getBatch());
//           updatedAdmin.setDob(student.getDob());
//           updatedAdmin.setMobileno(student.getMobileno());
//           updatedStudent.setStream(student.getStream()); 
//
//           StudentRepository.save(updatedStudent); 
//           return Optional.of(updatedStudent);
//       }
//
//       return Optional.empty();
		return null;
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
