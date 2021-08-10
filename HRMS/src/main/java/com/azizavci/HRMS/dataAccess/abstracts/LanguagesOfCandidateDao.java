package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.LanguagesOfCandidate;

public interface LanguagesOfCandidateDao extends JpaRepository<LanguagesOfCandidate, Integer> {

}
