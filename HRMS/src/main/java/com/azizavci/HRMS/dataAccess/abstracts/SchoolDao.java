package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School, Integer>{

}
