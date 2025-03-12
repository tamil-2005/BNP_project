package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StudentController {

	
	@Autowired
	public StudentService StudentService;
	

	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents() {
	    List<Student> students = StudentService.getAllStudents();
	    return ResponseEntity.ok(students);
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	    Student createStudent = StudentService.createStudent(student);
	    return ResponseEntity.ok(createStudent);
	}
	
	@GetMapping("/students/{rollno}")
	public ResponseEntity<Optional<Student>> getStudentByRegno(@PathVariable Integer rollno) {
	    Optional<Student> getStudentById = StudentService.getStudentByRegno(rollno);
	    return ResponseEntity.ok(getStudentById);
	}

//	@GetMapping("/students/{batch}")
//	public ResponseEntity<Optional<Student>> getStudentsByBatch(@PathVariable Integer batch) {
//	    Optional<Student> getStudentsByBatch = StudentService.getStudentByRegno(batch);
//	    return ResponseEntity.ok(getStudentsByBatch);
//	}
//	
	
	
	
}
	


