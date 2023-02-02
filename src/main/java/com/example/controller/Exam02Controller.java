package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam2")
public class Exam02Controller {

	@GetMapping("")
	public String index() {
		return "exam02-input";
	}
	
}
