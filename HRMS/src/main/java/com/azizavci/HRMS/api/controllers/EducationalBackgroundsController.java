package com.azizavci.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azizavci.HRMS.business.abstracts.EducationalBackgroundService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.EducationalBackground;

@RestController
@RequestMapping("/api/educationalBackgrounds")
public class EducationalBackgroundsController {

	private EducationalBackgroundService educationalBackgroundService;

	@Autowired
	public EducationalBackgroundsController(EducationalBackgroundService educationalBackgroundService) {
		
		super();
		this.educationalBackgroundService = educationalBackgroundService;
	
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EducationalBackground educationalBackground) {
		
		return this.educationalBackgroundService.add(educationalBackground);
		
	}
	
	@GetMapping("/getAll")
	public DataResult<List<EducationalBackground>> getAll(){
		
		return this.educationalBackgroundService.getAll();
		
	}
	
}
