package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		//create the message
		String result = "Hi " + theName + "!  Here is a penguin:";
		
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
}
