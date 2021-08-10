package com.azizavci.HRMS.business.abstracts;

import java.util.List;

import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.School;


public interface SchoolService {

	// CRUD
	Result add(School school);
		
	DataResult<List<School>> getAll();
	
}
