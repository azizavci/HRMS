package com.azizavci.HRMS.business.abstracts;

import com.azizavci.HRMS.entities.concretes.Candidate;

public interface CandidateVerificationService extends UserVerificationService {

	boolean isCandidateVerified(Candidate candidate);
	
}
