package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.EmployeeService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.EmployeeDao;
import com.azizavci.HRMS.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		
		this.employeeDao = employeeDao;
		
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll(),"personeller listelendi");
	}

	@Override
	public Result add(Employee employee) {
		
		employeeDao.save(employee);
		
		return new SuccessResult("kayıt başarılı lütfen epostanızı onaylayın");
		
	}

}
