package com.azizavci.HRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.azizavci.HRMS.business.abstracts.JobAdvertService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.JobAdvert;
import com.azizavci.HRMS.entities.dtos.JobAdvertWithEmployerDto;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/jobAdverts")
public class JobAdvertsController {

	private JobAdvertService jobAdvertService;

	public JobAdvertsController(JobAdvertService jobAdvertService) {
		
		super();
		this.jobAdvertService = jobAdvertService;
	
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvert>> getAll(){
	
		return jobAdvertService.getAll();
	
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		
		return jobAdvertService.add(jobAdvert);
	
	}
	
	@GetMapping("/getJobAdvertWithEmployerDetails")
	public DataResult<List<JobAdvertWithEmployerDto>> getJobAdvertWithEmployerDetails(){
	
		return jobAdvertService.getJobAdvertWithEmployerDetails();
	
	}
	
	@GetMapping("/getAllByActivityIfTrue")
	public DataResult<List<JobAdvert>> getAllByActivityIfTrue(){
	
		return jobAdvertService.getAllByActivityIfTrue();
	
	}
	
	@GetMapping("/getAllByDateDesc")
	public DataResult<List<JobAdvert>> getAllByDateDesc(){
	
		return jobAdvertService.getAllByDateDesc();
	
	}
	
	
	@GetMapping("/getAllByDateAsc")
	public DataResult<List<JobAdvert>> getAllByDateAsc(){
	
		return jobAdvertService.getAllByDateAsc();
	
	}
	
	@PostMapping("/changeActivity")
	public Result changeActivity(@RequestParam int id) {
		
		return jobAdvertService.changeActivity(id);
	
	}
	
}
