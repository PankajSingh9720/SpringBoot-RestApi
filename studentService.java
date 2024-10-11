package com.springboot.projects.springboot_restapi.service;

import java.util.List;

import com.springboot.projects.springboot_restapi.entity.Student;

public interface studentService {

	/*
	 *  this method is used to get all the student details but 
	    implementation is in another class name studentServiceImpl
	 */
	public List<Student> getStudents();
	
	/*
	 *  this method is used to get one the student details at a time by using the 
	    student id and implementation is in another class name studentServiceImpl
	 */
	public Student getStudent(int studentId);
	
	public Student addStudent(Student student); 
	
	
}
