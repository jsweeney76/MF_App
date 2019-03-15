package com.MF_App.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MF_App.domain.User;
import com.MF_App.service.UserService;

@Controller
public class LoginController 
{
	@Autowired
	private UserService userService;
	
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
	
	@RequestMapping(value="/settings", method=RequestMethod.GET)
	public String settings(ModelMap model) 
	{
		model.put("user", new User());
		return "settings";
	}
	
	@PostMapping("/register")
	public String registerPost (User user) {
		userService.save(user);
		return "redirect:/login";
	}
	
}
