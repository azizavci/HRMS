package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.WebContactService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.WebContactDao;
import com.azizavci.HRMS.entities.concretes.WebContact;

@Service
public class WebContactManager implements WebContactService{

	private WebContactDao webContactDao;

	@Autowired
	public WebContactManager(WebContactDao webContactDao) {
		super();
		this.webContactDao = webContactDao;
	}

	@Override
	public Result add(WebContact webContact) {
		
		this.webContactDao.save(webContact);
		return new SuccessResult("site eklendi!");
		
	}

	@Override
	public DataResult<List<WebContact>> getAll() {
		
		return new SuccessDataResult<List<WebContact>>(this.webContactDao.findAll(),"veriler listelendi!");			
		
	}
	
	
	
}
