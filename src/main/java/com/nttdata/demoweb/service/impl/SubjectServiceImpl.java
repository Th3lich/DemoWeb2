package com.nttdata.demoweb.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.demoweb.repository.SubjectRepoJPA;
import com.nttdata.demoweb.repository.entity.Subject;
import com.nttdata.demoweb.service.SubjectService;


@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	SubjectRepoJPA subjectRepo;

	@Override
	public List<Subject> listAll() {
		return subjectRepo.findAll();
	}

}
