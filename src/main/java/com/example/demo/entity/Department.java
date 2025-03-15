package com.example.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



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

	public long getDept_id() {
		return dept_id;
	}

	public void setDept_id(long dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDeptsyl_1() {
		return deptsyl_1;
	}

	public void setDeptsyl_1(String deptsyl_1) {
		this.deptsyl_1 = deptsyl_1;
	}

	public String getDeptsyl_2() {
		return deptsyl_2;
	}

	public void setDeptsyl_2(String deptsyl_2) {
		this.deptsyl_2 = deptsyl_2;
	}

	public String getDeptsyl_3() {
		return deptsyl_3;
	}

	public void setDeptsyl_3(String deptsyl_3) {
		this.deptsyl_3 = deptsyl_3;
	}

	public String getDeptsyl_4() {
		return deptsyl_4;
	}

	public void setDeptsyl_4(String deptsyl_4) {
		this.deptsyl_4 = deptsyl_4;
	}

	public String getDeptsyl_5() {
		return deptsyl_5;
	}

	public void setDeptsyl_5(String deptsyl_5) {
		this.deptsyl_5 = deptsyl_5;
	}

	public Department(long dept_id, String dept_name, String deptsyl_1, String deptsyl_2, String deptsyl_3,
			String deptsyl_4, String deptsyl_5) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.deptsyl_1 = deptsyl_1;
		this.deptsyl_2 = deptsyl_2;
		this.deptsyl_3 = deptsyl_3;
		this.deptsyl_4 = deptsyl_4;
		this.deptsyl_5 = deptsyl_5;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", deptsyl_1=" + deptsyl_1
				+ ", deptsyl_2=" + deptsyl_2 + ", deptsyl_3=" + deptsyl_3 + ", deptsyl_4=" + deptsyl_4 + ", deptsyl_5="
				+ deptsyl_5 + "]";
	}
	
	
	public Department() {}
	
	
	
	
	

}
