package com.nttdata.demoweb.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nttdata.demoweb.repository.entity.Subject;
import com.nttdata.demoweb.service.SubjectService;


@RestController
@RequestMapping ("/api/subjects")
public class SubjectRestController {

	@Autowired
	SubjectService subjectService;
	
	@GetMapping
	@Cacheable(value="subjects")
	public List<Subject> listSubjects() {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {}
		
		return subjectService.listAll();
	}
}
