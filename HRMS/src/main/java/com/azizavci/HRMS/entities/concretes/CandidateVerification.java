package com.azizavci.HRMS.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidate_verifications")

public class CandidateVerification {

	@Id
	@Column(name="verification_id")
	private int verificationId;
	
	@Column(name="is_verified")
	private String isVerified;
	
	@Column(name="verification_date")
	private LocalDate verificationDate=LocalDate.now();
		
	@OneToOne
	@MapsId
	@JoinColumn(name="verification_id")
	private VerificationCode verificationCode;
	
}
