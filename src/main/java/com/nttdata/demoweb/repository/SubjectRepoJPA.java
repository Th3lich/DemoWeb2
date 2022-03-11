package com.nttdata.demoweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nttdata.demoweb.repository.entity.Subject;


public interface SubjectRepoJPA extends JpaRepository<Subject, Integer> {
	
}
