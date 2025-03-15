package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="Grade")

public class Grade {
	
	@Id
	@Column(name="reg_no")
	private long regno;
	
	@Column(name="grade_1")
	private long grade_1;
	
	@Column(name="grade_2")
	private long grade_2;
	
	@Column(name="grade_3")
	private long grade_3;
	
	@Column(name="grade_4")
	private long grade_4;
	
	@Column(name="grade_5")
	private long grade_5;
	
	
	

	public long getDept_id() {
		return regno;
	}

	public void setDept_id(long dept_id) {
		this.regno = dept_id;
	}

	public long getGrade_1() {
		return grade_1;
	}

	public void setGrade_1(long grade_1) {
		this.grade_1 = grade_1;
	}

	public long getGrade_2() {
		return grade_2;
	}

	public void setGrade_2(long grade_2) {
		this.grade_2 = grade_2;
	}

	public long getGrade_3() {
		return grade_3;
	}

	public void setGrade_3(long grade_3) {
		this.grade_3 = grade_3;
	}

	public long getGrade_4() {
		return grade_4;
	}

	public void setGrade_4(long grade_4) {
		this.grade_4 = grade_4;
	}

	public long getGrade_5() {
		return grade_5;
	}

	public void setGrade_5(long grade_5) {
		this.grade_5 = grade_5;
	}

	public Grade(long dept_id, long grade_1, long grade_2, long grade_3, long grade_4, long grade_5) {
		super();
		this.regno = dept_id;
		this.grade_1 = grade_1;
		this.grade_2 = grade_2;
		this.grade_3 = grade_3;
		this.grade_4 = grade_4;
		this.grade_5 = grade_5;
	}
	
	
	public Grade() {}

	@Override
	public String toString() {
		return "Grade [dept_id=" + regno + ", grade_1=" + grade_1 + ", grade_2=" + grade_2 + ", grade_3=" + grade_3
				+ ", grade_4=" + grade_4 + ", grade_5=" + grade_5 + "]";
	}
	
	
	

	
	
}
