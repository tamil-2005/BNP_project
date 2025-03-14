package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="Student")

public class Syllabus {
	@Id
	@Column(name="dept_id")
	private long dept_id;
	
	
	@Column(name="sylabus_1")
	private String sylabus_1;
	
	@Column(name="sylabus_2")
	private String sylabus_2;
	
	@Column(name="sylabus_3")
	private String sylabus_3;
	
	@Column(name="sylabus_4")
	private String sylabus_4;
	
	@Column(name="sylabus_5")
	private String sylabus_5;

	public long getDept_id() {
		return dept_id;
	}

	public void setDept_id(long dept_id) {
		this.dept_id = dept_id;
	}

	public String getSylabus_1() {
		return sylabus_1;
	}

	public void setSylabus_1(String sylabus_1) {
		this.sylabus_1 = sylabus_1;
	}

	public String getSylabus_2() {
		return sylabus_2;
	}

	public void setSylabus_2(String sylabus_2) {
		this.sylabus_2 = sylabus_2;
	}

	public String getSylabus_3() {
		return sylabus_3;
	}

	public void setSylabus_3(String sylabus_3) {
		this.sylabus_3 = sylabus_3;
	}

	public String getSylabus_4() {
		return sylabus_4;
	}

	public void setSylabus_4(String sylabus_4) {
		this.sylabus_4 = sylabus_4;
	}

	public String getSylabus_5() {
		return sylabus_5;
	}

	public void setSylabus_5(String sylabus_5) {
		this.sylabus_5 = sylabus_5;
	}

	public Syllabus(long dept_id, String sylabus_1, String sylabus_2, String sylabus_3, String sylabus_4,
			String sylabus_5) {
		super();
		this.dept_id = dept_id;
		this.sylabus_1 = sylabus_1;
		this.sylabus_2 = sylabus_2;
		this.sylabus_3 = sylabus_3;
		this.sylabus_4 = sylabus_4;
		this.sylabus_5 = sylabus_5;
	}
	
	public Syllabus() {}

	@Override
	public String toString() {
		return "Syllabus [dept_id=" + dept_id + ", sylabus_1=" + sylabus_1 + ", sylabus_2=" + sylabus_2 + ", sylabus_3="
				+ sylabus_3 + ", sylabus_4=" + sylabus_4 + ", sylabus_5=" + sylabus_5 + "]";
	}
	

}
