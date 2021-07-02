package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.PositionService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.ErrorResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.PositionDao;
import com.azizavci.HRMS.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		
		this.positionDao = positionDao;
		
	}

	@Override
	public DataResult<List<Position>> getAll() {
		
		return new SuccessDataResult<List<Position>>(positionDao.findAll(),"iş pozisyonları listelendi");
		
	}

	@Override
	public Result add(Position position) {

		if (positionDao.findByTitle(position.getTitle())!=null) {
			
			return  new ErrorResult("bu iş pozisyonu sistemde mevcut");
		}
		
		positionDao.save(position);
		return new SuccessResult("iş pozisyonu eklendi");
		
	}

}
