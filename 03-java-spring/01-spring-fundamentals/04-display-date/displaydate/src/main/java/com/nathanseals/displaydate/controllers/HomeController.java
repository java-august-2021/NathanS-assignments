package com.nathanseals.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/")
	private String index() {
		return "index.jsp";
	}
	@RequestMapping("/date") 
	private String date(Model model) {
		Date date = new Date();
		SimpleDateFormat d = new SimpleDateFormat("EEE, 'the' d 'of' MMMM, yyyy");
		String getDate = d.format(date);
		model.addAttribute("date", getDate);
		return "date.jsp";
		}
	@RequestMapping("/time") 
	private String time(Model model) {
		Date time = new Date();
		SimpleDateFormat t = new SimpleDateFormat("h:mm a");
		String getTime = t.format(time);
		model.addAttribute("time", getTime);
		return "time.jsp";
		}
	}

