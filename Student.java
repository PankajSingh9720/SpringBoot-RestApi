package com.springboot.projects.springboot_restapi.entity;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAdress;
	private long studentAge ;
	
	
	public Student() {
		super();
	}


	public Student(int studentId, String studentName, String studentAdress, long studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdress = studentAdress;
		this.studentAge = studentAge;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentAdress() {
		return studentAdress;
	}


	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}


	public long getStudentAge() {
		return studentAge;
	}


	public void setStudentAge(long studentAge) {
		this.studentAge = studentAge;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdress=" + studentAdress
				+ ", studentAge=" + studentAge + ", getStudentId()=" + getStudentId() + ", getStudentName()="
				+ getStudentName() + ", getStudentAdress()=" + getStudentAdress() + ", getStudentAge()="
				+ getStudentAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	


}