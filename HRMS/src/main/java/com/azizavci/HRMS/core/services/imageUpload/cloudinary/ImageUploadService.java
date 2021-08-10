package com.azizavci.HRMS.core.services.imageUpload.cloudinary;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.azizavci.HRMS.core.utilities.results.DataResult;

public interface ImageUploadService {

	@SuppressWarnings("rawtypes")
	DataResult<Map> imageUpload(MultipartFile file);
	
}
