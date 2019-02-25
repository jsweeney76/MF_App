package com.MF_App.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MF_App.domain.User;

@Controller
public class LoginController 
{
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(ModelMap model) 
	{
		model.put("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String registerPost (User user) {
		System.out.println(user);
		return "redirect:/login";
	}
}
