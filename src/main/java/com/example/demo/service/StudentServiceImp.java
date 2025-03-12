package com.example.demo.service;
import com.example.demo.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	public StudentRepository StudentRepository;
	

	@Override
	public List<Student> getAllStudents() {
		return StudentRepository.findAll();
	}


	@Override
	public Student createStudent(Student Student) {
		return StudentRepository.save(Student);
	}


	@Override
	public Optional<Student> getStudentByRegno(Integer regno) {
		return StudentRepository.findById(regno);
	}


	@Override
	public List<Student> getStudentsByBatch(Integer batch) {
//		return StudentRepository.findAllById(batch);
		return null;
	}


	@Override
	public List<Student> getStudentsBydept(String dept) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Student updateByRegno(Integer regno) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Student deleteAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Student deleteStudentsByRegno(Integer regno) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Student deleteStudentsByBatch(Integer batch) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Student deleteStudentsBydept(String dept) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Student> getStudentsByBatch() {
		// TODO Auto-generated method stub
		return null;
	}






	
	
	
}
