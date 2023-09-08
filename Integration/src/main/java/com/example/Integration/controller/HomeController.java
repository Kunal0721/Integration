package com.example.Integration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Integration.model.User;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String register() {
		return "register";
	}
	
	@PostMapping("/")
	public String submitform(@ModelAttribute User user) {
		System.out.println(user.toString());
		return "welcome";
	}
}
