package com.springboot.projects.springboot_restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.projects.springboot_restapi.entity.Student;
import com.springboot.projects.springboot_restapi.service.studentService;

@RestController
public class Mycontroller {

	@Autowired // it is used to create the object and inject in this class automatically
	private studentService studentservice;

	// this method is used for perform basic operation in controller 

	@GetMapping("/home")
	public String Home() {

		return " Hard work is the best gift of the success, "
				+ "and love is blind please don't foolow the all these things ,"
				+ "these things are injerious for the health and life also :Pankaj Singh......";
	}

	// this method is used to the get all the students.

	@GetMapping("/students")
	public List<Student> getStudents() {
		return this.studentservice.getStudents();
		
	}

	/*this method is used to the get student uniquely by using the student id
	 * 
	 */

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId ) {

		return this.studentservice.getStudent(studentId);
	}
	
	
	@PostMapping("/addstudent")
	//OR  PostMapping(path="/student",consums="application/json")
	public Student addStudent(@RequestBody Student student) {
		return this.studentservice.addStudent(student);
		
	}
}
