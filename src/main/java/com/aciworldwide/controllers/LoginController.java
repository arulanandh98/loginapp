package com.aciworldwide.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aciworldwide.entities.User;
import com.aciworldwide.services.UserService;


//presentation layer-request processing component of spring web mvc
@Controller
public class LoginController {
	
	//used to invoke business layer
	@Autowired
	private UserService userService;
	
	//request processing method
	
	@RequestMapping("/signin") //handler mapping- used to map request URL with request processing method of controller
	public String validateUser(User user,ModelMap map)
	{
		
		
		//business logic method is invoked of business/service layer
		if(userService.isValid(user))
		{
			map.addAttribute("uname", user.getUsername());
			//logical view name is success 
			return "success";
		}
		else
		{
			map.addAttribute("logonerror", "Invalid username/Password");
			return "login";
		}
		
	}
	
	

}
