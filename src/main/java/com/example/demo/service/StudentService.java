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
	List<Student> getStudentsBydept(Integer dept);
	
// update
	
	Optional<Student> updateByRegno(Integer regno ,Student Student);
	
// Delete
	
	void deleteStudentsByRegno(Integer regno);
	void deleteStudentsByBatch(Integer batch);







	
	
}
