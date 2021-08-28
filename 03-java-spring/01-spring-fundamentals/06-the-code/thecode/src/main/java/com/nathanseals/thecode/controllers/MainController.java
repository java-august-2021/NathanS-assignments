package com.nathanseals.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String errors) {
		return "index.jsp";
	}
	@RequestMapping("/errors")
	public String errors(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("errors", "You must train harder!");
		return ("redirect:/");
	}
	private Boolean isCorrect(String code) {
		return code.equals("bushido");
	}
	@RequestMapping(path="/check", method=RequestMethod.POST)
	public String check(@RequestParam(value="code") String code, Model model, RedirectAttributes redirectAttributes) {
		if (isCorrect(code)) {
			return "redirect:/code";
		}
		else {
			return "redirect:/errors";
		}
	}
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
		}
	}

