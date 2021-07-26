package com.azizavci.HRMS.dataAccess.abstracts;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.azizavci.HRMS.entities.concretes.JobAdvert;
import com.azizavci.HRMS.entities.dtos.JobAdvertWithEmployerDto;

@Transactional
public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer>{

	List<JobAdvert> findByIsActive(boolean value);
	
	List<JobAdvert> findByIsActiveTrue(Sort sort);
		
	
	// JPQL
	@Query("Select new com.azizavci.HRMS.entities.dtos.JobAdvertWithEmployerDto"
			+ "(j.id,e.companyName,p.title,j.numberOfOpenPosition,j.creationDate,j.applicationDeadline)"
			+ " from JobAdvert j Inner Join j.position p Inner Join j.employer e Inner Join j.city c ")
	List<JobAdvertWithEmployerDto> getJobAdvertWithEmployerDetails();
	
	@Modifying
	@Query("update JobAdvert j Set j.isActive = true Where j.id=:id")
	void changeActivitiy(@Param("id") int id);

}
