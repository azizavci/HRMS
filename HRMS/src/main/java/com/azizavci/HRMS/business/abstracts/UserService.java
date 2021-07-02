package com.azizavci.HRMS.business.abstracts;


import com.azizavci.HRMS.core.utilities.results.Result;

public interface UserService {

	Result checkEmailVerified(String email);
	Result checkEmailAlreadyExist(String email);
	Result sendVerificationCode(String email, String verificationCode);
	
	
}
