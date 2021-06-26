package com.azizavci.HRMS.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidate_verifications")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "verification_id" , referencedColumnName = "id")
@EqualsAndHashCode(callSuper = false)
public class CandidateVerification {

	@ManyToOne()
	@JoinColumn(name="user_id")
	private Employer employer;
	
}
