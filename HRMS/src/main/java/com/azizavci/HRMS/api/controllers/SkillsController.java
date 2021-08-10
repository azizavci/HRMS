package com.azizavci.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azizavci.HRMS.business.abstracts.SkillService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

	private SkillService skillService;
	
	@Autowired
	public SkillsController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Skill>> getAll(){
		
		return this.skillService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Skill skill) {
		
		return this.skillService.add(skill);
	
	}
	
}
