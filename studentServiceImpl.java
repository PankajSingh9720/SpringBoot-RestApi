package com.springboot.projects.springboot_restapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.projects.springboot_restapi.entity.Student;

@Service
public class studentServiceImpl implements studentService {

	List<Student> list;

	public studentServiceImpl() {

		list = new ArrayList<>();
		list.add(new Student(121, "anuj", "noida", 22));
		list.add(new Student(131, "ravi", "panjab", 12));
		list.add(new Student(141, "hari", "hariyana", 25));
		list.add(new Student(151, "shiva", "delhi", 21));
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return list;
	}

	public Student getStudent(int studentId) {
		
		
		Student s= null;
		for(Student student:list) {
			if(student.getStudentId()==studentId) {
				
				s=student;
				break;
			}
		}
				
		return s;
	}

	@Override
	public Student addStudent(Student student) {
		list.add(student);
		System.out.println(" Your Data SuccessFully Added ...");
		return student;
	}


}
