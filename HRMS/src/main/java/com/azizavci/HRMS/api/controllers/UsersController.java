package com.azizavci.HRMS.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azizavci.HRMS.business.abstracts.UserService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.User;


@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		
		super();
		this.userService=userService;
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		
		return this.userService.add(user);
		
	}
	
	@GetMapping("/getAll")
	public DataResult<List<User>> getAll(){
		
		return this.userService.getAll();
		
	}
	
	
	
	
}
