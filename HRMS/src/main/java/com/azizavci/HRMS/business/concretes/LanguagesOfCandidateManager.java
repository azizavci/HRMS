package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.LanguagesOfCandidateService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.LanguagesOfCandidateDao;
import com.azizavci.HRMS.entities.concretes.LanguagesOfCandidate;

@Service
public class LanguagesOfCandidateManager implements LanguagesOfCandidateService {

	private LanguagesOfCandidateDao languagesOfCandidateDao;

	@Autowired
	public LanguagesOfCandidateManager(LanguagesOfCandidateDao languagesOfCandidateDao) {
	
		super();
		this.languagesOfCandidateDao = languagesOfCandidateDao;
	
	}

	@Override
	public Result add(LanguagesOfCandidate languagesOfCandidate) {
		
		this.languagesOfCandidateDao.save(languagesOfCandidate);
		return new SuccessResult("aday için dil verisi eklendi!");
		
	}

	@Override
	public DataResult<List<LanguagesOfCandidate>> getAll() {
		
		return new SuccessDataResult<List<LanguagesOfCandidate>>(this.languagesOfCandidateDao.findAll(),"adaya ait dil verileri listelendi!");
		
	}
	
	
	
	
}
