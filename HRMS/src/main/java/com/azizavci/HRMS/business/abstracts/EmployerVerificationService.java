package com.azizavci.HRMS.business.abstracts;

import com.azizavci.HRMS.entities.concretes.Employer;

public interface EmployerVerificationService extends UserVerificationService {

	boolean isEmployerVerified(Employer employer);
	
}
