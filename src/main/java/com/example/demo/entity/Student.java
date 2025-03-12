package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="Student")

public class Student {
	
	@Id
	private long regno;
	@Column(name="Student_name")
	private String name;
	@Column(name="Student_batch")
	private long batch;
	@Column(name="Student_dept")
	private String dept;
	@Column(name="Student_mobileno")
	private long mobileno;
	@Column(name="Student_dob")
	private LocalDate dob;
	@Column(name="Student_stream")
	private String stream;
	public long getRegno() {
		return regno;
	}
	public void setRegno(long regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBatch() {
		return batch;
	}
	public void setBatch(long batch) {
		this.batch = batch;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", batch=" + batch + ", dept=" + dept + ", mobileno="
				+ mobileno + ", dob=" + dob + ", stream=" + stream + "]";
	}
	public Student(long regno, String name, long batch, String dept, long mobileno, LocalDate dob, String stream) {
		super();
		this.regno = regno;
		this.name = name;
		this.batch = batch;
		this.dept = dept;
		this.mobileno = mobileno;
		this.dob = dob;
		this.stream = stream;
	}
	
	
	
	public Student(){
		
	};
	
	
}