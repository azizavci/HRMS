package com.azizavci.HRMS.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azizavci.HRMS.business.abstracts.UserService;
import com.azizavci.HRMS.core.services.verificationCodeSender.VerificationCodeSenderManager;
import com.azizavci.HRMS.core.services.verificationCodeSender.VerificationCodeSenderService;
import com.azizavci.HRMS.core.utilities.results.ErrorResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.UserDao;

import lombok.var;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	private VerificationCodeSenderService codeSender;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
		this.codeSender=new VerificationCodeSenderManager();
	}

	@Override
	public Result checkEmailVerified(String email) {
		
		var user = userDao.getByEmail(email);
		if(user == null) {
			return new ErrorResult("Böyle bir kayıt yok");
		}
		else if(!user.isEmailVerified()) {
			return new ErrorResult("E-posta onaylı değil");
		}
		else {
			return new SuccessResult("E-posta onaylı");
		}
		
	}

	@Override
	public Result checkEmailAlreadyExist(String email) {
		
		var user = userDao.getByEmail(email);
		
		if(user != null) {
			return new SuccessResult("Bu e-posta zaten kullanılıyor");
		}
		else {
			return new ErrorResult("Bu e-posta kullanılabilir");
		}
		
	}

	@Override
	public Result sendVerificationCode(String email, String verificationCode) {
		
		codeSender.sendVerificationCode(email, verificationCode);
		
		return new SuccessResult("Doğrulama kodu gönderildi");
		
	}

	


}
