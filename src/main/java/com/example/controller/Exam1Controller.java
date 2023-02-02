package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("name")
public class Exam1Controller {

	@GetMapping("")
	public String index() {
		return "exam01";
	}

	@PostMapping("/input")
	public String input(String name, Model model) {
		model.addAttribute(name);
		return "exam01-result";
	}
}
