package com.azizavci.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azizavci.HRMS.business.abstracts.LanguagesOfCandidateService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.LanguagesOfCandidate;

@RestController
@RequestMapping("/api/languagesOfCandidates")
public class LanguagesOfCandidatesController {

	private LanguagesOfCandidateService languagesOfCandidateService;
	
	@Autowired
	public LanguagesOfCandidatesController(LanguagesOfCandidateService languagesOfCandidateService) {
		
		super();
		this.languagesOfCandidateService = languagesOfCandidateService;
	
	}

	@GetMapping("/getAll")
	public DataResult<List<LanguagesOfCandidate>> getAll(){
		
		return this.languagesOfCandidateService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody LanguagesOfCandidate languagesOfCandidate) {
		
		return this.languagesOfCandidateService.add(languagesOfCandidate);
	
	}
	
}
