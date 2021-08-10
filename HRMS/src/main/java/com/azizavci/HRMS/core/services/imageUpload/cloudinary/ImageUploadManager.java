package com.azizavci.HRMS.core.services.imageUpload.cloudinary;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.ErrorDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;


@Service
public class ImageUploadManager implements ImageUploadService {

	private Cloudinary cloudinary;

	public ImageUploadManager() {

		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "azzavc",
				"api_key", "615438541934276",
				"api_secret", "U43fx5jyBrBbgX5x5XBAdUBY1Rg",
				"secure", true));
		
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	public DataResult<Map> imageUpload(MultipartFile file) {
		
		try {
			//file.getBytes() --> Convert MultipartFile to File
			Map uploadResult = (Map<String,?>)cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
			
			return new SuccessDataResult<Map>(uploadResult);
			
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}
		return new ErrorDataResult<Map>();
	}
	
	
	
	
	
	

	

	
	
}
