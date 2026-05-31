package com.dev.spring.mvc.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloFormController {
	

@GetMapping("/hii")
	 public String sayHelloform(Model theModel) {

		theModel.addAttribute("Style","Hello World - Input-Form" );

	        return "hiWorld-form";
}
	
@GetMapping("/ProcessFormVersionTwo")
	 
	 public String processFormVersionTwo(HttpServletRequest request, Model themodel) {
	 
	 String theName = request.getParameter("FirstName");
	 
	 themodel.addAttribute("FirstName",theName);
	 
	 String theName1 = request.getParameter("LastName");
	 
	 themodel.addAttribute("LastName",theName1);
	 
	 String theName2 = request.getParameter("Email");
	
	 themodel.addAttribute("Email",theName2);
	 
	 String theName3 = request.getParameter("Phonenumber");
	
	 themodel.addAttribute("Phonenumber",theName3);
	 
	 String theName4 = request.getParameter("Age");

	 themodel.addAttribute("Age",theName4);
	 
	 String theName5 = request.getParameter("Address");
	
	 themodel.addAttribute("Address",theName5);
	 
	 String theName6 = request.getParameter("Skill");
		
	 themodel.addAttribute("Skill",theName6);
	 
	 
	 String theName7 = request.getParameter("Education");
	
	 themodel.addAttribute("Education",theName7);
	 
	 return "Hiworld";
}
	 
/*	 String theName = request.getParameter("studentName");
	 String theName = request.getParameter("studentName");
	 String theName = request.getParameter("studentName");
	 String theName = request.getParameter("studentName");
	 String theName = request.getParameter("studentName");
	 String theName = request.getParameter("studentName");
	 */
	 



	    // model.addAttribute("FirstName", user.getFirstName());
	   

}

