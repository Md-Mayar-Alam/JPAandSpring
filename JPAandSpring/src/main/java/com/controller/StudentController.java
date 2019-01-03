package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Student;
import com.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	private final static String STUDENT_MODEL="student";
	
	@RequestMapping(value="/addStudentForm", method=RequestMethod.GET)
	public String returnAddStudentForm(Model model) {
	
		model.addAttribute(STUDENT_MODEL, new Student());
		return "addStudentForm";
	}
	
	@ResponseBody
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public String addStudent(@ModelAttribute(STUDENT_MODEL) Student student) {
		return studentService.addStudent(student);
	}
}
