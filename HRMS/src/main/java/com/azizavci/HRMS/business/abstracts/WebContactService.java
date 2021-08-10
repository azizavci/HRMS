package com.azizavci.HRMS.business.abstracts;

import java.util.List;

import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.WebContact;

public interface WebContactService {

	Result add(WebContact webContact);
	
	DataResult<List<WebContact>> getAll();
	
	
	
}
