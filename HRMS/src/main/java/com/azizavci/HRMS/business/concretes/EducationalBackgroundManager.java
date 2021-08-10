package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.EducationalBackgroundService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.EducationalBackgroundDao;
import com.azizavci.HRMS.entities.concretes.EducationalBackground;

@Service
public class EducationalBackgroundManager implements EducationalBackgroundService {

	private EducationalBackgroundDao educationalBackgroundDao;

	@Autowired
	public EducationalBackgroundManager(EducationalBackgroundDao educationalBackgroundDao) {
		
		super();
		this.educationalBackgroundDao = educationalBackgroundDao;
	
	}

	@Override
	public Result add(EducationalBackground educationalBackground) {
		
		this.educationalBackgroundDao.save(educationalBackground);
		return new SuccessResult("eğitim geçmişi bilgisi eklendi!");
	
	}

	@Override
	public DataResult<List<EducationalBackground>> getAll() {

		return new SuccessDataResult<List<EducationalBackground>>(this.educationalBackgroundDao.findAll(),"eğitim geçmişi verileri listelendi!");		
		
	}
	
	
	
}
