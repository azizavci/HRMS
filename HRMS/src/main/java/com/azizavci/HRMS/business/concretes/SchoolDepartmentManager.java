package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.SchoolDepartmentService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.SchoolDepartmentDao;
import com.azizavci.HRMS.entities.concretes.SchoolDepartment;

@Service
public class SchoolDepartmentManager implements SchoolDepartmentService {

	private SchoolDepartmentDao schoolDepartmentDao;

	@Autowired
	public SchoolDepartmentManager(SchoolDepartmentDao schoolDepartmentDao) {
		super();
		this.schoolDepartmentDao = schoolDepartmentDao;
	}

	@Override
	public DataResult<List<SchoolDepartment>> getAll() {
		
		return new SuccessDataResult<List<SchoolDepartment>>(this.schoolDepartmentDao.findAll(), "bölümler listelendi");
		
	}

	@Override
	public Result add(SchoolDepartment schoolDepartment) {

		this.schoolDepartmentDao.save(schoolDepartment);
		return new SuccessResult("bölüm bilgisi eklendi");
	
	}
	
	
	
}
