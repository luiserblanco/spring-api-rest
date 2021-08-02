package com.luiserblanco.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiserblanco.enrollment.data.entity.Student;
import com.luiserblanco.enrollment.data.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {	
	
	@Autowired
	private StudentRepository studentRepository;
		
	@GetMapping
	public Iterable<Student>getStudents() {
		return studentRepository.findAll();		
	}
}
