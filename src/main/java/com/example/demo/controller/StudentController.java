package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
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
	

	// Get All Students
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents() {
	    List<Student> students = StudentService.getAllStudents();
	    return ResponseEntity.ok(students);
	}
	
	
//	Create Student
	@PostMapping("/students")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	    Student createStudent = StudentService.createStudent(student);
	    return ResponseEntity.ok(createStudent);
	}
	
//	Get Student By Reg
    @GetMapping("/students/regno/{rollno}")
    public ResponseEntity<Optional<Student>> getStudentByRegno(@PathVariable Integer rollno) {
        Optional<Student> student = StudentService.getStudentByRegno(rollno);
        return ResponseEntity.ok(student);
    }

    // Get Students by Batch
    @GetMapping("/students/batch/{batch}")
    public ResponseEntity<List<Student>> getStudentsByBatch(@PathVariable Integer batch) {
        List<Student> batchStudent = StudentService.getStudentsByBatch(batch);
        return ResponseEntity.ok(batchStudent);
    }    
    
    
//    Get Student By Dept
    
//    @GetMapping("/students/dept/{dept}")
//    public ResponseEntity<List<Student>> getStudentsBydept(@PathVariable String dept) {
//    	String word=dept.toUpperCase();
//        List<Student> batchStudent = StudentService.getStudentsByBatch(dept);
//        return ResponseEntity.ok(batchStudent);
//    } 
    
    
    @PutMapping("/students/regno/{regno}")
    public ResponseEntity<Student> updateByRegno(@PathVariable Integer regno, @RequestBody Student student) {
        Optional<Student> updatedStudent = StudentService.updateByRegno(regno, student);
        
        if (updatedStudent.isPresent()) {
            return ResponseEntity.ok(updatedStudent.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    
    
    
    
    @DeleteMapping("/students/regno/{regno}")
    public ResponseEntity<Void> deleteStudentsByRegno(@PathVariable Integer regno) {
        StudentService.deleteStudentsByRegno(regno);
        return ResponseEntity.noContent().build();
    }
    
    
    @DeleteMapping("/students/batch/{batch}")
    public ResponseEntity<Void> deleteStudentsByBatch(@PathVariable Integer batch) {
        StudentService.deleteStudentsByBatch(batch);
        return ResponseEntity.noContent().build(); 
    }
    

    
    
    

    
    
}
	


