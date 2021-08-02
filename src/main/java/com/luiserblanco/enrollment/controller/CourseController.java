package com.luiserblanco.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiserblanco.enrollment.data.entity.Course;
import com.luiserblanco.enrollment.data.repository.CourseRepository;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired 
	private CourseRepository  courseRepository;
	
	@GetMapping
	public Iterable<Course> getCourse(){
		return courseRepository.findAll();
	}
	

}
