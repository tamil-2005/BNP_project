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
	@Column(name="Student_dept_id")
	private int dept_id;
	@Column(name="Student_mobileno")
	private long mobileno;
	@Column(name="Student_dob")
	private LocalDate dob;
	@Column(name="Student_stream")
	private String stream;
	@Column(name="Student_email")
	private String email;
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
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(long regno, String name, long batch, int dept_id, long mobileno, LocalDate dob, String stream,
			String email) {
		super();
		this.regno = regno;
		this.name = name;
		this.batch = batch;
		this.dept_id = dept_id;
		this.mobileno = mobileno;
		this.dob = dob;
		this.stream = stream;
		this.email = email;
	}
	
	
	public Student() {}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", batch=" + batch + ", dept_id=" + dept_id
				+ ", mobileno=" + mobileno + ", dob=" + dob + ", stream=" + stream + ", email=" + email + "]";
	}
	
	
	
	
	
	
}