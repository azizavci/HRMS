package com.azizavci.HRMS.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.azizavci.HRMS.business.abstracts.UserVerificationService;

public class UserVerificationManager implements UserVerificationService {

	@Override
	public boolean emailFormatVerification(String email) {
		
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		
		if(!(matcher.find())) {
			return false;
		}
		else {
			return true;
		}
		
	}

}
