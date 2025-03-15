package com.example.demo.service;

import java.util.*;

import com.example.demo.entity.Grade;

public interface GradeService {
	
	
//	add
	Grade addGrade(Grade Grade);
	

	
	
//	get by RegNo
	Optional<Grade> getGradeByReg(Long regno);
	
//	Reset Grade With RegNo
	Optional<Grade> resetGradeByReg(Long regno,Grade Grade);
	
	

}
