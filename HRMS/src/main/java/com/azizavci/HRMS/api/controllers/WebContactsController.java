package com.azizavci.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azizavci.HRMS.business.abstracts.WebContactService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.WebContact;

@RestController
@RequestMapping("/api/webContacts")
public class WebContactsController {

	private WebContactService webContactService;

	@Autowired
	public WebContactsController(WebContactService webContactService) {
		super();
		this.webContactService = webContactService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<WebContact>> getAll(){
		
		return webContactService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody WebContact webContact) {

		return webContactService.add(webContact);
	
	}
	
	
}
