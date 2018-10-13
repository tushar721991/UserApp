package com.softedge.userapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softedge.userapp.entities.User;
import com.softedge.userapp.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String getHomePage() {
		return "index";
	}
	
	@RequestMapping("/loginPage")
	public String getLoginPage(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	@RequestMapping("/registrationPage")
	public String getRegistrationPage(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	
	@RequestMapping(value = "/login" , method=RequestMethod.POST)
	public String authenticate(@ModelAttribute User user, Model model) {
	
		if (userService.authenticate(user)) {
			return "welcome";
		} else {
			model.addAttribute("message", "Invalid Username or Password.");
			return "login";
		}
	}
	
	@RequestMapping(value = "/register" , method=RequestMethod.POST)
	public String registerUser(@ModelAttribute User user) {
		userService.registerUser(user);
		return "success";
	}
	
	
}
