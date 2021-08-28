package com.nathanseals.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String survey(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language, @RequestParam(value="comment") String comment, HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/dashboard";
	}
	@RequestMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		String name = (String) session.getAttribute("name");
		String location = (String) session.getAttribute("locaiton");
		String language = (String) session.getAttribute("language");
		String comment = (String) session.getAttribute("comment");
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		return "dashboard.jsp";
	}
}
