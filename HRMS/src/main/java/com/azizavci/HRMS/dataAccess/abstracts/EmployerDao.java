package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
