package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Student {
	
	@javax.persistence.Id
	
	private Long Id;
	String student_name;
	String maths_marks;
	String science_marks;
	String history_marks;
	
	
	public Student(Long id, String student_name, String maths_marks, String science_marks, String history_marks) {
		super();
		Id = id;
		this.student_name = student_name;
		this.maths_marks = maths_marks;
		this.science_marks = science_marks;
		this.history_marks = history_marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getMaths_marks() {
		return maths_marks;
	}
	public void setMaths_marks(String maths_marks) {
		this.maths_marks = maths_marks;
	}
	public String getScience_marks() {
		return science_marks;
	}
	public void setScience_marks(String science_marks) {
		this.science_marks = science_marks;
	}
	public String getHistory_marks() {
		return history_marks;
	}
	public void setHistory_marks(String history_marks) {
		this.history_marks = history_marks;
	}
	
}
