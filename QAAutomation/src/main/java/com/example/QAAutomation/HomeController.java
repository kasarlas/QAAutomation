package com.example.QAAutomation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home") //specify that, 
	public String showHomePage() 
	{//method return back a string
	System.out.println("Controller Invoked");
	return "home";
}

}