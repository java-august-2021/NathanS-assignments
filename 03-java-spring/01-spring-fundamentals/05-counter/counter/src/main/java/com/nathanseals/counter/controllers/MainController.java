package com.nathanseals.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} 
		else {
			Integer sessioncount = (Integer)session.getAttribute("count");
			session.setAttribute("count", sessioncount + 1);
		} return "index.jsp";
	}
	@RequestMapping("/counter")
	public String showcount(HttpSession session, Model model) {
			Integer visitcount = (Integer)session.getAttribute("count");
			model.addAttribute("showcount", visitcount);
			return "showcount.jsp";
	}
}
