package com.dev.spring.mvc.thymeleafdemo.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.spring.mvc.thymeleafdemo.Model.Customer;
import com.dev.spring.mvc.thymeleafdemo.Model.Student;

import jakarta.validation.Valid;

@Controller
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		databinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@GetMapping("/Customer/login")
	public String showform(Model themodel) {
	
		Customer cus = new Customer();
		
		themodel.addAttribute("Customer",cus);
		
		return "customer-form";
	}
	@PostMapping("/ProcessFormCustomer")
	
	public String ProcessFormCustomer(@Valid@ModelAttribute("Customer") Customer thecustomer,BindingResult theBindResult ) {
		
		System.out.println("thecustomer: " + thecustomer.getFullname() + "" + thecustomer.getPassword() + "" + thecustomer.getEmail() + "" + thecustomer.getPhonenumber() + "" + thecustomer.getFreepass());
		
		if(theBindResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
		
		
	}

}
