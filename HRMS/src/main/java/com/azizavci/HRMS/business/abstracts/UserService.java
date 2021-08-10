package com.azizavci.HRMS.business.abstracts;

import java.util.List;

import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.User;

public interface UserService {

	Result checkEmailVerified(String email);
	Result checkEmailAlreadyExist(String email);
	Result sendVerificationCode(String email, String verificationCode);	
	
	DataResult<List<User>> getAll();
	
	Result add(User user);
}
