package com.azizavci.HRMS.business.concretes;

import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.EmployerVerificationService;
import com.azizavci.HRMS.core.utilities.verifications.Verification;
import com.azizavci.HRMS.entities.concretes.Employer;

@Service
public class EmployerVerificationManager extends UserVerificationManager implements EmployerVerificationService {

	@Override
	public boolean isEmployerVerified(Employer employer) {
		
		return !(Verification.stringsIsNullOrEmpty(employer.getCompanyName(),employer.getEmail(),employer.getPassword(),
				employer.getWebSite(), employer.getPhone()));
		
	}

}
