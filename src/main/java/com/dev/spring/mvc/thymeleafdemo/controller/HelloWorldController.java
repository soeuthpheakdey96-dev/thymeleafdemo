package com.dev.spring.mvc.thymeleafdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class HelloWorldController {
	
	 @GetMapping("/hi")
	    public String sayHelloform(Model theModel) {
    
	 	 theModel.addAttribute("Style","Hello World - Input-Form" );
     
	        return "helloworld-form";
	        
}
	 
//	 @GetMapping("/processForm")
//	 
//	    public String sayHello(Model theModel) {
//		 theModel.addAttribute("Style","Hello World - Input-Form" );
//	 		return "helloworld"; 
//	 		
//	 }
	 
	 @GetMapping("/processFormVersionTwo")
	 
	 public String processFormVersionTwo(HttpServletRequest request, Model themodel) {
	 
	 String theName = request.getParameter("studentName");
	 
	 //theName = theName.toUpperCase();
	 
	 // String result = "Yo!" + theName;
	 
	 themodel.addAttribute("message");
	 return "helloworld";
	 
}
	 
	 @PostMapping("/ProcessFormVersionOne")
	 public String ProcessFormVersionOne(@RequestParam("FirstName1") String thename,@RequestParam("LastName1") String thelname,
			 @RequestParam("Email1") String theemail, Model model) {
	     model.addAttribute("FirstName1", thename);
	     model.addAttribute("LastName1", thelname);
	     model.addAttribute("Email1", theemail);
	     return "helloworld";
	 }
	 }
