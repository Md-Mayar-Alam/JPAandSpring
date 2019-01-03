package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student findStudentById(Integer studentId) {
		return studentRepository.findOne(studentId);
	}
	
	public String addStudent(Student student) {
		
		Student savedStudent= studentRepository.save(student);
		
		System.out.println("Inside StudentService addStudent() Student Details are: ");
		System.out.println("Saved Student ID is "+savedStudent.getStudentId());
		System.out.println("Saved Student Name "+savedStudent.getName());
		
		if(savedStudent.getName().equals("") || savedStudent.getName()==null) {
			return "Student Details Not Saved";
		}else {
			return "Student Details Saved Successfully";
		}
	}
}
