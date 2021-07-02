package com.azizavci.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="verification_codes")
public class VerificationCode {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="characters")
	private String characters;
	
	@OneToOne(mappedBy = "verificationCode")
    @PrimaryKeyJoinColumn
    private CandidateVerification candidateVerification;
	
	@OneToOne(mappedBy = "verificationCode")
    @PrimaryKeyJoinColumn
    private EmployerVerification employerVerification;
	
}