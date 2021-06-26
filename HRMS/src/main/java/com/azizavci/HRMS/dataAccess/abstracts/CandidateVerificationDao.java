package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.CandidateVerification;

public interface CandidateVerificationDao extends JpaRepository<CandidateVerification, Integer>{

}
