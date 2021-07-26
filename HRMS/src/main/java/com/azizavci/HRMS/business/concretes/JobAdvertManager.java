package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.JobAdvertService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.JobAdvertDao;
import com.azizavci.HRMS.entities.concretes.JobAdvert;
import com.azizavci.HRMS.entities.dtos.JobAdvertWithEmployerDto;

@Service
public class JobAdvertManager implements JobAdvertService {

	private JobAdvertDao jobAdvertDao;

	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
	
		this.jobAdvertDao = jobAdvertDao;
	
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {

		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(),"veriler listelendi");
	
	}

	@Override
	public DataResult<List<JobAdvert>> getAllByActivityIfTrue() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActive(true),"veriler listelendi");
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("başarıyla kaydedildi");
	}

	@Override
	public Result changeActivity(int id) {
		
		this.jobAdvertDao.changeActivitiy(id);
		return new SuccessResult("aktif edildi");
		
	}

	@Override
	public DataResult<List<JobAdvertWithEmployerDto>> getJobAdvertWithEmployerDetails() {
		
		return new SuccessDataResult<List<JobAdvertWithEmployerDto>>(this.jobAdvertDao.getJobAdvertWithEmployerDetails(),"veriler listelendi");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllByDateDesc() {
		
		Sort sort = Sort.by(Sort.Direction.DESC, "creationDate");

		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActiveTrue(sort),"DESC");
	
	}

	@Override
	public DataResult<List<JobAdvert>> getAllByDateAsc() {
		
		Sort sort = Sort.by(Sort.Direction.ASC, "creationDate");

		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActiveTrue(sort),"ASC");
		
	}

	
}
