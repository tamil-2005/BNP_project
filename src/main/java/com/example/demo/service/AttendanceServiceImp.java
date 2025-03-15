package com.example.demo.service;

import java.util.List;
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
	public void resetAttendance() {
	    List<Attendance> resettotal = AttendanceRepository.findAll(); 

	    for (Attendance attendance : resettotal) {
	        attendance.setSub1(0);
	        attendance.setSub2(0);
	        attendance.setSub3(0);
	        attendance.setSub4(0);
	        attendance.setSub5(0);
	    }

	    AttendanceRepository.saveAll(resettotal); 
	}



	@Override
	public Optional<Attendance> getAllAttendance(Long regno) {
		return AttendanceRepository.findById(regno);
	}

	@Override
	public Attendance resetAttendanceByreg(Attendance attentance,Long regno) {
	    Optional<Attendance> resetall = AttendanceRepository.findById(regno);

	    if (resetall.isPresent()) {
	        Attendance attendance = resetall.get();
	        attendance.setSub1(0);  
	        attendance.setSub2(0);  
	        attendance.setSub3(0); 
	        attendance.setSub4(0);
	        attendance.setSub5(0);
	        return AttendanceRepository.save(attendance);  // Reference
	    }
		return null;
	}


	
	
	
}
