package com.azizavci.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azizavci.HRMS.business.abstracts.PositionService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.Position;


@RestController
@RequestMapping("/api/positions")
public class PositionsController {

	private PositionService positionService;
		
	@Autowired 
	public PositionsController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}

	@GetMapping("/getall")
	public DataResult<List<Position>> getAll(){
		
		return positionService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Position position) {
		
		return positionService.add(position);
		
	}
}
