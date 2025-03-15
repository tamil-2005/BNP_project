package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Grade;

public interface GradeRepository extends JpaRepository<Grade,Long> {


}
