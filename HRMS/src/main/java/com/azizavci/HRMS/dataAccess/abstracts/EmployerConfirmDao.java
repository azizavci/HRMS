package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.EmployerConfirm;

public interface EmployerConfirmDao extends JpaRepository<EmployerConfirm,Integer> {

}
