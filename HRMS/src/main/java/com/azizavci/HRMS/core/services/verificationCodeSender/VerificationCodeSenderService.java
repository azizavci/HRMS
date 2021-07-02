package com.azizavci.HRMS.core.services.verificationCodeSender;

public interface VerificationCodeSenderService {

	boolean sendVerificationCode(String email,String code);
	
}
