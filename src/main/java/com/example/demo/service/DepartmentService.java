package com.example.demo.service;

import com.example.demo.entity.Department;
import java.util.List;
import java.util.Optional;

public interface DepartmentService {
	
    List<Department> getAllDepartments();
    Optional<Department> getDepartmentById(Long id);
    Department saveDepartment(Department department);
    Department updateDepartment(Long id, Department department);
    void deleteDepartment(Long id);
    
}