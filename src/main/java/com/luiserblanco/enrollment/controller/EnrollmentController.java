package com.luiserblanco.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiserblanco.enrollment.data.entity.Enrollment;
import com.luiserblanco.enrollment.data.repository.EnrollmentRepository;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

	@Autowired 
	private EnrollmentRepository enrollmentRepository;
		
	@RequestMapping
	public Iterable<Enrollment> getEnrollment(){		
		return enrollmentRepository.findAll();
	}
}
