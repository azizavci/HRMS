package com.azizavci.HRMS.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.azizavci.HRMS.business.abstracts.ImageService;
import com.azizavci.HRMS.core.services.imageUpload.cloudinary.ImageUploadService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.ErrorResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.core.utilities.results.SuccessDataResult;
import com.azizavci.HRMS.core.utilities.results.SuccessResult;
import com.azizavci.HRMS.dataAccess.abstracts.ImageDao;
import com.azizavci.HRMS.dataAccess.abstracts.UserDao;
import com.azizavci.HRMS.entities.concretes.Image;


@Service
public class ImageManager implements ImageService {

	private ImageDao imageDao;
	private UserDao userDao;
	private ImageUploadService imageUploadService;
	
	@Autowired
	public ImageManager(ImageDao imageDao,ImageUploadService imageUploadService,
			UserDao userDao) {
		
		this.imageDao = imageDao;
		this.imageUploadService=imageUploadService;
		this.userDao=userDao;
		
	}

	@SuppressWarnings({"rawtypes"})
	@Override
	public Result uploadImage(MultipartFile file, int userId) {
		
		DataResult<Map> uploadResult = this.imageUploadService.imageUpload(file);
		
		if(uploadResult.getData() != null) {
			
			Image userImage = new Image();
			userImage.setImageUrl(uploadResult.getData().get("url").toString());
			userImage.setIsImageAvailable(true);
			userImage.setUser(userDao.getById(userId));
			
			this.imageDao.save(userImage);
			
			return new SuccessResult("Başarılı bir şekilde image sisteme yüklendi");
		}
		
		return new ErrorResult("UserImageManager uploadResult null");
	}

	@Override
	public DataResult<List<Image>> getAll() {
		
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(),"resimler listelendi!");
		
	}

	

	
	
}
