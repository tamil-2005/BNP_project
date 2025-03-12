package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Student;

public interface StudentService {
	
//Create
	
	Student createStudent(Student Student);
	
	
// get
	
	List<Student> getAllStudents();
	Optional<Student> getStudentByRegno(Integer regno);
	List<Student> getStudentsByBatch(Integer batch);
	List<Student> getStudentsBydept(String dept);
	
// update
	
	Student updateByRegno(Integer regno);
	
// Delete
	
	Student deleteAllStudents();
	Student deleteStudentsByRegno(Integer regno);
	Student deleteStudentsByBatch(Integer batch);
	Student deleteStudentsBydept(String dept);


	List<Student> getStudentsByBatch();
	
	
}
