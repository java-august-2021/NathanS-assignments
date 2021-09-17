package com.nathanseals.dojooverflow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nathanseals.dojooverflow.models.Question;
import com.nathanseals.dojooverflow.services.QuestionService;
import com.nathanseals.dojooverflow.services.TagService;

@Controller
public class HomeController {
	@Autowired
	private QuestionService qServ;
	@Autowired
	private TagService tServ;
	
	@GetMapping("/")
	public String index(@ModelAttribute ("question") Question question, Model model) {
		List<Question> questions = qServ.allQuestion();
		model.addAttribute("questions", questions);
		return "allQuestions.jsp";
	}
	@GetMapping("/question/new")
	public String newQuestion(@ModelAttribute("question") Question question) {
		return "addQuestion.jsp";
	}
}
