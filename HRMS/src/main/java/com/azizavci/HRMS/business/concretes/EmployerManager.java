package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.EmployerService;
import com.azizavci.HRMS.business.abstracts.EmployerVerificationService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.ErrorResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.EmployerDao;
import com.azizavci.HRMS.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private EmployerVerificationService employerVerificationService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, EmployerVerificationService employerVerificationService) {
	
		this.employerDao = employerDao;
		this.employerVerificationService = employerVerificationService;
	
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		return new SuccessDataResult<List<Employer>>(employerDao.findAll(), "işverenler listelendi");
				
	}

	@Override
	public Result add(Employer employer) {
				
		if (!employerVerificationService.isEmployerVerified(employer)) {
			
			return new ErrorResult("lütfen tüm alanları doldurunuz");
			
		}
		
		else if (!employerVerificationService.emailFormatVerification(employer.getEmail())) {
			
			return new ErrorResult("lütfen geçerli bir email adresi giriniz");
			
		}
		
		else if (employerDao.findByEmail(employer.getEmail())!=null ) {
			
			return  new ErrorResult("bu email adresi kullanımda");
			
		}
		
		else {
			
			employerDao.save(employer);
			return new SuccessResult("kayıt başarılı lütfen epostanızı onaylayın");
			
		}
		
	}

}
