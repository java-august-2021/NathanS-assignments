package com.nathanseals.routingpractice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String greet() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python") 
	public String python() {
		return "Python/Django were great";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring are better!";
	}
}
