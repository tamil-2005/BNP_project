package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendance;
import com.example.demo.repository.AttendanceRepository;

@Service

public class AttendanceServiceImp implements AttendanceService {

	@Autowired
	public AttendanceRepository AttendanceRepository;
	
	@Override
	public Attendance setAttendance(Attendance attentance) {
		return AttendanceRepository.save(attentance);
	}

	@Override
	public Attendance overAllAttendance(Attendance attentance) {
//		return AttendanceRepository.findAll();
		return null;
	}

	@Override
	public Attendance resetAttendance(Attendance attentance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attendance resetAttendanceBySub(Attendance attentance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Attendance> getAllAttendance(Long regno) {
		return AttendanceRepository.findById(regno);
	}

	
	
	
}
