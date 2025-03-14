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
        return StudentRepository.findByBatch(batch);
    }

    
    
    
    
    
    // not
    
    @Override
    public List<Student> getStudentsBydept(String dept) { 
//        return StudentRepository.findBydept(dept); 
    	return null;
    }






	@Override
	public void deleteStudentsByRegno(Integer regno) {
		StudentRepository.deleteById(regno);
	}


	@Override
	public void deleteStudentsByBatch(Integer batch) {
		StudentRepository.deleteById(batch);
	}




	@Override
	 public Optional<Student> updateByRegno(Integer regno, Student student) {
        Optional<Student> existingStudent = StudentRepository.findById(regno);
        
        if (existingStudent.isPresent()) {
            Student updatedStudent = existingStudent.get();
            updatedStudent.setName(student.getName());  
            updatedStudent.setDept_id(student.getDept_id());
            updatedStudent.setBatch(student.getBatch());
            updatedStudent.setDob(student.getDob());
            updatedStudent.setMobileno(student.getMobileno());
            updatedStudent.setStream(student.getStream()); 

            StudentRepository.save(updatedStudent); 
            return Optional.of(updatedStudent);
        }

        return Optional.empty();
    }

	
	
}
