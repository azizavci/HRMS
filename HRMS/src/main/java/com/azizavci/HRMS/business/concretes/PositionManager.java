package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.PositionService;
import com.azizavci.HRMS.dataAccess.abstracts.PositionDao;
import com.azizavci.HRMS.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		
		super();
		this.positionDao = positionDao;
		
	}

	@Override
	public List<Position> getAll() {
		
		return this.positionDao.findAll();
		
	}

}
