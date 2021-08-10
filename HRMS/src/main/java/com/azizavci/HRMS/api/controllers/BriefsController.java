package com.azizavci.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azizavci.HRMS.business.abstracts.BriefService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.Brief;

@RestController
@RequestMapping("/api/briefs")
public class BriefsController {

	private BriefService briefService;

	@Autowired
	public BriefsController(BriefService briefService) {
		super();
		this.briefService = briefService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Brief>> getAll(){
		
		return this.briefService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Brief brief) {
		
		return this.briefService.add(brief);
	
	}
	
	
}
