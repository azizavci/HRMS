package com.azizavci.HRMS.business.abstracts;

import java.util.List;

import com.azizavci.HRMS.entities.concretes.Position;

public interface PositionService {

	List<Position> getAll(); 
	
}
