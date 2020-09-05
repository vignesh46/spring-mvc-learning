package com.srv.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processform")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processform2")
	public String modelExample(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		model.addAttribute("message", name.toUpperCase());
		return "helloworld";
	}
	
	@RequestMapping("/processform3")
	public String reqParamExample(@RequestParam("studentName") String name, Model model) {
		model.addAttribute("message", name.toUpperCase());
		return "helloworld";
	}

}
