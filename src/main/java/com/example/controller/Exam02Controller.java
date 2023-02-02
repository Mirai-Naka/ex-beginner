package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Sum;
import com.example.form.SumForm;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@Autowired
	private HttpSession session;

	@GetMapping("")
	public String index() {
		return "exam02-input";
	}

	@PostMapping("/input")
	public String input(String num1, String num2) {
		Sum sum = new Sum();

		sum.setNum1(Integer.parseInt(num1));
		sum.setNum2(Integer.parseInt(num2));
		int result = (sum.getNum1() + sum.getNum2());

		session.setAttribute("sum", sum);
		session.setAttribute("result", result);

		return "exam02-result";
	}

	@GetMapping("/result")
	public String result() {
		return "exam02-result2";
	}
}
