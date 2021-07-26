package com.azizavci.HRMS.business.abstracts;

import java.util.List;

import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.JobAdvert;
import com.azizavci.HRMS.entities.dtos.JobAdvertWithEmployerDto;

public interface JobAdvertService {
	
	DataResult<List<JobAdvert>> getAll();
	
	DataResult<List<JobAdvert>> getAllByActivityIfTrue();
	
	DataResult<List<JobAdvert>> getAllByDateDesc();
	
	DataResult<List<JobAdvert>> getAllByDateAsc();		
	
	DataResult<List<JobAdvertWithEmployerDto>> getJobAdvertWithEmployerDetails();
	
	
	Result add(JobAdvert jobAdvert);
	
	Result changeActivity(int id);
	
}
