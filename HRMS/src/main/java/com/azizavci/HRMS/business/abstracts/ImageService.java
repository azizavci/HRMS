package com.azizavci.HRMS.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.Image;

public interface ImageService {

	Result uploadImage(MultipartFile file, int userId);
	
	DataResult<List<Image>> getAll();

	
}
