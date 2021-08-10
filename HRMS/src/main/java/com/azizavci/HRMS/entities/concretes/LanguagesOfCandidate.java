package com.azizavci.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="languagesOfCandidate")
public class LanguagesOfCandidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@ManyToOne()
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@NotNull
	@ManyToOne()
	@JoinColumn(name="language_id")
	private Language language;
	
	@Min(1)
	@Max(5)
	@NotNull
	@Column(name="language_level")
	private int languageLevel;
	
}
