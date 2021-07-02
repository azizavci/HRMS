package com.azizavci.HRMS.core.services.mernis;

import com.azizavci.HRMS.entities.concretes.Candidate;

public interface CandidateCheckService {

	boolean CheckIfRealPerson(Candidate candidate);
}
