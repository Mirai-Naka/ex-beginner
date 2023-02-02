package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam2")
public class Exam02Controller {

	@Autowired
	private HttpSession session;

	@GetMapping("")
	public String index() {
		return "exam02-input";
	}

	@PostMapping("/input")
	public String input(String num1, String num2) {

		session.setAttribute("num1", num1);
		session.setAttribute("num1", num2);
		int result = Integer.parseInt(num2) + num2;
		session.setAttribute("num1", num2);
		

		return "exam02-result";
	}
}
