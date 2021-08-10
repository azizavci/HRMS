package com.azizavci.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidates")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
public class Candidate extends User{
		
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="birth_year")
	private int birthYear;
	
	@Column(name="phone")
	private String phone;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<JobExperience> jobExperiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<EducationalBackground> educationalBackgrounds;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<LanguagesOfCandidate> languagesOfCandidates;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<Skill> skills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<WebContact> webContacts;
	
	@JsonIgnore
	@OneToOne(mappedBy = "candidate")
	private Brief brief;
	
	
}
