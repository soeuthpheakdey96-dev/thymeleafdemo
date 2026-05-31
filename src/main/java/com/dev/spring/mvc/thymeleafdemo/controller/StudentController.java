package com.dev.spring.mvc.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.spring.mvc.thymeleafdemo.Model.Student;

@Controller
public class StudentController {
	
	@Value("${countries}")
	private List<String>countries;
	
	@Value("${langues}")
	private List<String>langues;
	
	@Value("${system}")
	private List<String>systemapp;
	
	
	@GetMapping("/student/login")
	
	public String StudentLogin(Model model) {
		
		Student stu = new Student();
		
		model.addAttribute("student", stu);
		
		model.addAttribute("countries", countries);
		
		model.addAttribute("langues", langues);
		
		model.addAttribute("sys", systemapp);
		
		return "student-form";
	}
	
	@PostMapping("/ProcessFormStudent")
	
	public String ProcessFormStudent(@ModelAttribute("student") Student thestudent ) {
		
		System.out.println("thestudent: " + thestudent.getFirstname() + "" + thestudent.getLastname());
		
		return "student-confirmation";
	}

	

}
