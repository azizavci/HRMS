package com.azizavci.HRMS.core.services.verificationCodeSender;

import org.springframework.stereotype.Service;

@Service
public class VerificationCodeSenderManager implements VerificationCodeSenderService{

	@Override
	public boolean sendVerificationCode(String email, String code) {
		
		System.out.println(email+" adresine doğrulama kodu gönderildi : "+code);
		
		return true;
	}

}
