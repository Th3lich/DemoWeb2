package com.nttdata.demoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.nttdata.demoweb.service.SubjectService;


@Controller
public class WebController {
	
	@Autowired
	SubjectService subjectService;
	
	
	@GetMapping("/list_subjects")
	public String listSubjects(Model model) {
		model.addAttribute("subjects", subjectService.listAll());
		return "subject_list";
	}
	
	@GetMapping("/error")
	public String errorPage() {
		return "error";
	}
}
