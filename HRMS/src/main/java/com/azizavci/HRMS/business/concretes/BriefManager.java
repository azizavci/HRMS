package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.BriefService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.BriefDao;
import com.azizavci.HRMS.entities.concretes.Brief;

@Service
public class BriefManager implements BriefService {

	private BriefDao briefDao;

	@Autowired
	public BriefManager(BriefDao briefDao) {
		super();
		this.briefDao = briefDao;
	}

	@Override
	public Result add(Brief brief) {
		
		this.briefDao.save(brief);
		return new SuccessResult("özgeçmiş bilgisi eklendi!");
	}

	@Override
	public DataResult<List<Brief>> getAll() {
		
		return new SuccessDataResult<List<Brief>>(this.briefDao.findAll(),"veriler listelendi");
		
	}
	
	
	
}
