package com.MF_App.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController 
{
	
	@RequestMapping(value="/", method=RequestMethod.GET)

	public String rootView()
	{
		return "index";
	}
	
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public String dashboardView()
	{
		return "dashboard";
	}
	
//	@RequestMapping(value="/settings", method=RequestMethod.GET)
//	public String settingsView()
//	{
//		return "settings";
//	}
}
