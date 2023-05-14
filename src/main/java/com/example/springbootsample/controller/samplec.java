package com.example.springbootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class samplec {
	@GetMapping("uservalidation")
	public String useValidation() {
		return "Hello World";
	}
}
