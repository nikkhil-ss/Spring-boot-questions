package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentrepository;

	@Override
	public Student addStudent(Student student) {
		return studentrepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentrepository.findAll();
	}

	@Override
	public Optional<Student> getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentrepository.findById(id);
	}

	@Override
	public Student updateEmployeeById(Long id, Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

	@Override
	public String deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		 if (studentrepository.findById(id).isPresent()) {
	            studentrepository.deleteById(id);
	            return "Employee deleted successfully";
	        }
	        return "No such employee in the database";
	}

}
