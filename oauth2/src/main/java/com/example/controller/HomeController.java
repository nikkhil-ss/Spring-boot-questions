package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "This is home";
	}
	@GetMapping("/home")
	public String home2() {
		return "This is home2";
	}
	
	@GetMapping("/secured")
	public String secured() {
		return "This is secured";
	}
}