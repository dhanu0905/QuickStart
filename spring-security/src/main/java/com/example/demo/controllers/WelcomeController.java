package com.example.demo.controllers;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class WelcomeController {

	@GetMapping(path="/students")
	public String getStudent(Principal principal) {
		
		System.out.println("Accessed Person For Student Page:= "+principal.getName());
		return "Student Suresh";
	}
	
	@GetMapping(path="/teachers")
	public String getTeacher(Principal principal) {
		
		System.out.println("Accessed Person For Teacher Page:= "+principal.getName());
		return "Teacher Thanvi";
	}
	
	@GetMapping(path="/staff")
	public String getStaff(Principal principal) {
		
		System.out.println("Accessed Person For Staff Page:= "+principal.getName());
		return "Staff Shipra";
	}
}
