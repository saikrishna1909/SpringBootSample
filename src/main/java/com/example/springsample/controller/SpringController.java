package com.example.springsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringController {

	@GetMapping("/hello")
	public String GetHello() {
		return "Hello World";
		
	}
	
}
