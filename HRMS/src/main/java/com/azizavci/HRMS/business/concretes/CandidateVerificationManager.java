package com.azizavci.HRMS.business.concretes;

import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.CandidateVerificationService;
import com.azizavci.HRMS.core.utilities.verifications.Verification;
import com.azizavci.HRMS.entities.concretes.Candidate;

@Service
public class CandidateVerificationManager extends UserVerificationManager implements CandidateVerificationService {

	@Override
	public boolean isCandidateVerified(Candidate candidate) {
		
		return !(Verification.stringsIsNullOrEmpty(candidate.getFirstName(),candidate.getLastName(),candidate.getEmail(),
				candidate.getPassword(),candidate.getNationalityId(), candidate.getBirthYear()));
	} 

}
