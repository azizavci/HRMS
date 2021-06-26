package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.EmployerVerification;

public interface EmployerVerificationDao extends JpaRepository<EmployerVerification, Integer> {

}
