package com.nathanseals.routingpractice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
	public String dojo() {
		return "The dojo is awesome!";
	}
	@RequestMapping("/{location}") 
	public String location(@PathVariable ("location") String location) {
		switch (location) {
		case "burbank":
			return "The Burbank dojo is located in southern California";
		case "san-jose":
			return "The SJ dojo is the headquarters";
		default:
			return String.format("The %s dojo is pretty awesome!", location);
		}
		
	}

}

