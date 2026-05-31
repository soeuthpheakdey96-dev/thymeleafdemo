package com.dev.spring.mvc.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class DemoController {
	
 @GetMapping("/hello")
    public String sayHello(Model TheModel) {

	 TheModel.addAttribute("theDate", java.time.LocalDateTime.now());

        return "helloworld";
    }
// @GetMapping("/hi")
// 	private String sayHi(Model theModel) {
//	 
//	 int x=3;
//	 int y=6;
//	 int z=x+y;
//	 
//	 theModel.addAttribute("theDate", "SUM of two values +'x'+'y',z");
//	 return "wow";
//	
//	 
// }
 

     @GetMapping("/sum/{a}/{b}")
     public String sum(@PathVariable int a, @PathVariable int b,Model theModel) {
    	 
    	 int val1 = a;
    	 int val2 = b;
    	 int val = a + b ;
    	 
    	 theModel.addAttribute("thesum", "Sum of two values " + val1 + " + " + val2 + " = " + val);
    	 
    	 return "helloworld";
     }
 }
