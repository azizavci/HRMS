package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.EducationalBackground;

public interface EducationalBackgroundDao extends JpaRepository<EducationalBackground, Integer> {

}
