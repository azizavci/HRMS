package com.azizavci.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azizavci.HRMS.business.abstracts.SchoolDepartmentService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.SchoolDepartment;

@RestController
@RequestMapping("/api/schoolsDepartments")
public class SchoolDepartmentsController {

	private SchoolDepartmentService schoolDepartmentService;

	@Autowired
	public SchoolDepartmentsController(SchoolDepartmentService schoolDepartmentService) {
		super();
		this.schoolDepartmentService = schoolDepartmentService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<SchoolDepartment>> getAll(){
		
		return this.schoolDepartmentService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SchoolDepartment schoolDepartment) {
		
		return this.schoolDepartmentService.add(schoolDepartment);
	
	}
	
	
	
}
