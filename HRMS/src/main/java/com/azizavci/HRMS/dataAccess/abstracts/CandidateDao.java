package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

}
