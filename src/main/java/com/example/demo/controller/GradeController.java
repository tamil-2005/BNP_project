package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Grade;
import com.example.demo.entity.Student;
import com.example.demo.service.GradeService;

@RestController
@RequestMapping("/api")
public class GradeController {
	
	@Autowired
	public GradeService GradeService;
	
    @PostMapping("grade")
    public ResponseEntity<Grade> addGrade(@RequestBody Grade Grade) {
    	return ResponseEntity.ok(Grade);
    }
    
    @GetMapping("/grade/regno/{rollno}")
    public ResponseEntity<Optional<Grade>> getGradeByReg(@PathVariable Long rollno) {
        Optional<Grade> grade = GradeService.getGradeByReg(rollno);
        return ResponseEntity.ok(grade);
    }
    
    
    @PutMapping("/grade/regno/{regno}")
    public ResponseEntity<Grade> resetGradeByReg(@PathVariable Long regno, @RequestBody Grade Grade) {
        Optional<Grade> resetGrade = GradeService.resetGradeByReg(regno, Grade);
        
        if (resetGrade.isPresent()) {
            return ResponseEntity.ok(resetGrade.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    
    

}
