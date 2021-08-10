package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.LanguageService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.LanguageDao;
import com.azizavci.HRMS.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;

	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		
		super();
		this.languageDao = languageDao;
	
	}

	@Override
	public Result add(Language language) {

		this.languageDao.save(language);
		return new SuccessResult("dil başarıyla eklendi!");
	
	}

	@Override
	public DataResult<List<Language>> getAll() {

		return new SuccessDataResult<List<Language>>(this.languageDao.findAll(),"diller listelendi!");

	}
	
	
	
}
