package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Attendance;


public interface AttendanceService {
	
	
	Attendance setAttendance(Attendance attentance);
	
	Optional<Attendance> getAllAttendance(Long regno);
	
	
	

	
	Attendance resetAttendanceByreg(Attendance attentance,Long regno);

	void resetAttendance();

	
}
