package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.Candidate;
import com.azizavci.HRMS.entities.concretes.User;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

	Candidate findByEmail(String email);
	
	Candidate findByNationalityId(String nationalIdentity);
	
	Candidate getById(int id);
	
}
