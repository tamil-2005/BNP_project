package com.example.demo.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity

@Table(name="Attendance")

public class Attendance {
	
	@Id
	@Column(name="dept_id") 
	private long dept_id;
	
	@Column(name="reg_no") 
	private long regno;
	
	@Column(name="sub_1")
	private int sub1;
	
	@Column(name="sub_2")
	private int sub2;
	
	@Column(name="sub_3")
	private int sub3;
	
	@Column(name="sub_4")
	private int sub4;
	
	@Column(name="sub_5")
	private int sub5;

	
	@Column(name="overall")
	private int overall;


	public long getDept_id() {
		return dept_id;
	}


	public void setDept_id(long dept_id) {
		this.dept_id = dept_id;
	}


	public long getRegno() {
		return regno;
	}


	public void setRegno(long regno) {
		this.regno = regno;
	}


	public int getSub1() {
		return sub1;
	}


	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}


	public int getSub2() {
		return sub2;
	}


	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}


	public int getSub3() {
		return sub3;
	}


	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}


	public int getSub4() {
		return sub4;
	}


	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}


	public int getSub5() {
		return sub5;
	}


	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}


	public int getOverall() {
		return overall;
	}


	public void setOverall(int overall) {
		this.overall = overall;
	}


	public Attendance(long dept_id, long regno, int sub1, int sub2, int sub3, int sub4, int sub5, int overall) {
		super();
		this.dept_id = dept_id;
		this.regno = regno;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.overall = overall;
	}

	
	public Attendance() {}


	@Override
	public String toString() {
		return "Attendance [dept_id=" + dept_id + ", regno=" + regno + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3="
				+ sub3 + ", sub4=" + sub4 + ", sub5=" + sub5 + ", overall=" + overall + "]";
	}
	
	

	
	
	
	
	
	

}
