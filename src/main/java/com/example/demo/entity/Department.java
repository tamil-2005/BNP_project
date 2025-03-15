package com.example.demo.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity

@Table(name="Department")

public class Department {
	
	@Id
	@Column(name="dept_id")
	private long dept_id;
	
	@Column(name="dept_name")
	private String dept_name;
	
	@Column(name="deptsyl_1")
	private String deptsyl_1;
	
	@Column(name="deptsyl_2")
	private String deptsyl_2;
	
	@Column(name="deptsyl_3")
	private String deptsyl_3;
	
	@Column(name="deptsyl_4")
	private String deptsyl_4;
	
	@Column(name="deptsyl_5")
	private String deptsyl_5;

	public void setDept_id(Long id) {
		// TODO Auto-generated method stub
		
	}

}
