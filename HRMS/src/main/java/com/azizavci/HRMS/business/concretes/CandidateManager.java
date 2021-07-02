package com.azizavci.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.CandidateService;
import com.azizavci.HRMS.business.abstracts.CandidateVerificationService;
import com.azizavci.HRMS.core.services.mernis.CandidateCheckService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.ErrorResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.CandidateDao;
import com.azizavci.HRMS.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	private CandidateVerificationService candidateVerificationService;
	//private CandidateCheckService candidateCheckService;
	//private VerificationCodeSenderService codeSender;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao,CandidateVerificationService candidateVerificationService,CandidateCheckService candidateCheckService) {
		
		this.candidateDao = candidateDao;
		this.candidateVerificationService=candidateVerificationService;
		//this.candidateCheckService=candidateCheckService;
		//this.codeSender=new VerificationCodeSenderManager();
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(candidateDao.findAll(),"adaylar listelendi");
	}

	@Override
	public Result add(Candidate candidate) {

		
		
		
		if (!candidateVerificationService.isCandidateVerified(candidate)) {
			
			return new ErrorResult("lütfen tüm alanları doldurunuz");
			
		}
		
		else if (!candidateVerificationService.emailFormatVerification(candidate.getEmail())) {
			
			return new ErrorResult("lütfen geçerli bir email adresi giriniz");
			
		}
		
		else if (candidateDao.findByEmail(candidate.getEmail())!=null ) {
			
			return  new ErrorResult("bu email adresi kullanımda");
			
		}
		
		else if (candidateDao.findByNationalityId(candidate.getNationalityId())!=null ) {
			
			return  new ErrorResult("bu tc kimlik no kullanımda");
			
		}
		
		else {
			
			candidateDao.save(candidate);
			return new SuccessResult("kayıt başarılı lütfen epostanızı onaylayın");
			
		}
		
		/*
		
		else if(!candidateCheckService.CheckIfRealPerson(candidate)) {
			
			return new ErrorResult("kişi tespit edilemedi");
			
		}
		
		codeSender.sendVerificationCode(candidate.getEmail(), "12345");
		
		*/
		
		
		
	}

}
