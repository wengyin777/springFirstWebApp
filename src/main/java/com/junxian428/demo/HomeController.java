package com.junxian428.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() 
	{
		
		System.out.println("HiHi");
		return "home.jsp";
	}

}
