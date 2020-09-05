package com.srv.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		
		/**
		 * this will construct /WEB-INF/view/main-menu.jsp
		 * Since we configured prefix and suffix in spring-mvc-demo-servlet
		 */
		return "main-menu";
	}

}
