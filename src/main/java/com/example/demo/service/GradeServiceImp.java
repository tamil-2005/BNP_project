package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Grade;
import com.example.demo.repository.GradeRepository;


@Service

public class GradeServiceImp implements GradeService {
	
	@Autowired
	public GradeRepository GradeRepository;

	@Override
	public Grade addGrade(Grade Grade) {
		return GradeRepository.save(Grade);
	}

	@Override
	public Optional<Grade> getGradeByReg(Long regno) {
		return GradeRepository.findById(regno);
	}

	@Override
	public Optional<Grade> resetGradeByReg(Long regno, Grade Grade) {
		 List<Grade> resetGrade = GradeRepository.findAll();

		    for (Grade Gradeset : resetGrade) {
		    	Gradeset.setGrade_1(0);
		    	Gradeset.setGrade_2(0);
		    	Gradeset.setGrade_3(0);
		    	Gradeset.setGrade_4(0);
		    	Gradeset.setGrade_5(0);
		    	
		    	GradeRepository.saveAll(resetGrade); 
		    }
			
		    return Optional.empty(); 
	}




	
}
