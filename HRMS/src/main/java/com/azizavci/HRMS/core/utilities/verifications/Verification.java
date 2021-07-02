package com.azizavci.HRMS.core.utilities.verifications;

public class Verification {

	public static boolean stringsIsNullOrEmpty(Object... values) {
		for(Object value : values) {
			if(value == null || value.equals("")) {
				return true;
			}
		}
		
		return false;
	}

}
