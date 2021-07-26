package com.azizavci.HRMS.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertWithEmployerDto {

	private int id;
	private String companyName;
	private String position;
	private int numberOfOpenPosition;
	private LocalDate creationDate;
	private LocalDate applicationDeadline;
	
}
