package com.azizavci.HRMS.business.abstracts;

import java.util.List;

import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
	
}
