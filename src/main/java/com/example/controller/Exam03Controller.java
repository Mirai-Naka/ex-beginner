package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	@GetMapping("")
	public String index() {
		return "exam03";
	}

	@PostMapping("/input")
	public String input(String item1, String item2, String item3) {
		Item item = new Item();
		item.setItem1(Integer.parseInt(item1));
		item.setItem2(Integer.parseInt(item2));
		item.setItem3(Integer.parseInt(item3));

		int totalResult = (item.getItem1() + item.getItem2() + item.getItem3());
		int totalResultInTax = (int) (totalResult * 1.1);

		application.setAttribute("item", item);
		application.setAttribute("totalResult", totalResult);
		application.setAttribute("totalResultInTax", totalResultInTax);

		return "exam03-result";
	}

}
