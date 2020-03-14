package com.exam.SpringProfiler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.SpringProfiler.model.User;

@RestController
public class UserController {
	
	@Autowired
	User user;
	
	@GetMapping("/profile")
	public String welcomePage() {
		
		
		return user.toString();
	}
}
