package com.nathanseals.hellohuman.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String name(@RequestParam(value="name", required=false, defaultValue="Human") String name) {
		return String.format("Hello %s!", name);
	}
}
