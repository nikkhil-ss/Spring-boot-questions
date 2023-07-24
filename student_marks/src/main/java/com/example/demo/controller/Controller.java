package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class Controller {
	
	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/test")
	public String test() {
		return "=testt passed";
	}
	@PostMapping("/student")
	public Student addStudent(Student student) {
		return studentservice.addStudent(student);
	}
	@GetMapping("/student")
	public List<Student> getStudent(){
		return studentservice.getAllStudent();
	}
	
	
}
