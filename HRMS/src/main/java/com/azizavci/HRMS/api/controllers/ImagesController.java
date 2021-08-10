package com.azizavci.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.azizavci.HRMS.business.abstracts.ImageService;
import com.azizavci.HRMS.core.utilities.results.DataResult;
import com.azizavci.HRMS.core.utilities.results.Result;
import com.azizavci.HRMS.entities.concretes.Image;


@RestController
@RequestMapping("/api/images")
public class ImagesController {

	private ImageService imageService;
	
	@Autowired
	public ImagesController(ImageService imageService) {
		this.imageService=imageService;
	}
	
	@PostMapping("/imageUpload")
	public Result uploadImage (@RequestBody MultipartFile file, @RequestParam int userId){
		
		return this.imageService.uploadImage(file, userId);
	} 
	
	
	
	@GetMapping("/getall")
	public DataResult<List<Image>> getAll(){
		return this.imageService.getAll();
	}
	
	/*
	@GetMapping("/getById")
	public DataResult<Image> getById(@RequestParam(value = "imageId") int imageId){
		return this.imageService.getById(imageId);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Image image) {
		return this.imageService.update(image);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody Image image) {
		return this.imageService.delete(image);
	}
	
	*/
}
