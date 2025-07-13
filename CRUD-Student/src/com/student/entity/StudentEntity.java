package com.student.entity;

public class StudentEntity {
	private int rollNo;
	private String name;
	private String address;
	private String degree;
	private String feild;
	private long mobNo;
	private String email;
	private String grade;
	
	public StudentEntity() {
		
	}

	public StudentEntity(int rollNo, String name, String address, String degree, String feild, long mobNo, String email,
			String grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.degree = degree;
		this.feild = feild;
		this.mobNo = mobNo;
		this.email = email;
		this.grade = grade;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getFeild() {
		return feild;
	}

	public void setFeild(String feild) {
		this.feild = feild;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
