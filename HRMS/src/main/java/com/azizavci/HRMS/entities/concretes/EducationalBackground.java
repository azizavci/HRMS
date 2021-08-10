package com.azizavci.HRMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="educational_backgrounds")
public class EducationalBackground {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="starting_date")
	private Date startingDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="is_continue")
	private boolean isContinue;
	
	@ManyToOne()
	@JoinColumn(name="school_id")
	private School school;
	
	@ManyToOne()
	@JoinColumn(name="school_department_id")
	private SchoolDepartment schoolDepartment;
	
	@ManyToOne()
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	/*
	@ManyToOne()
	@JoinColumn(name="cvId")
	private CandidateCv candidateCv;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private Candidate candidate;
	
	@ManyToOne()
	@JoinColumn(name="schoolId")
	private School school;
	
	@ManyToOne()
	@JoinColumn(name="schoolDepartmentId")
	private SchoolDepartment schoolDepartment;
	
	
	
	*/
}
