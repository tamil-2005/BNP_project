package com.example.demo.controller;

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

import com.example.demo.entity.Attendance;
//import com.example.demo.entity.Student;
import com.example.demo.service.AttendanceService;

@CrossOrigin
@RestController
@RequestMapping("/api")

public class AttendanceController {
	@Autowired
	public AttendanceService AttendanceService;
	
	
	

	@GetMapping("/attendance/regno/{regno}")
	public ResponseEntity<Optional<Attendance>>  getAllAttendance(@PathVariable Long regno) {
	    Optional<Attendance> attend = AttendanceService.getAllAttendance(regno);
	    return ResponseEntity.ok(attend);
	}
	
	
//	Create Student
	@PostMapping("/attendance")
	public ResponseEntity<Attendance> setAttendance(@RequestBody Attendance attentance) {
		Attendance setAttendance = AttendanceService.setAttendance(attentance);
	    return ResponseEntity.ok(setAttendance);
	}
	
	
}
