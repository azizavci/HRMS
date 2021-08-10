package com.azizavci.HRMS.business.abstracts;

import java.util.List;

import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.SchoolDepartment;

public interface SchoolDepartmentService {

	DataResult<List<SchoolDepartment>> getAll();
	
	Result add(SchoolDepartment schoolDepartment);
	
}
