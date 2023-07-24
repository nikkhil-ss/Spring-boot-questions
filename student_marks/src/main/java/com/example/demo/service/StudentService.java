package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	List<Student> getAllStudent();
	Optional<Student> getStudentById(Long id);
	Student updateEmployeeById(Long id, Student student);
	String deleteStudentById(Long id);

}
