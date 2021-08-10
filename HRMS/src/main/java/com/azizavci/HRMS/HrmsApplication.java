package com.azizavci.HRMS;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class HrmsApplication {

	public static void main(String[] args) throws IOException {
		
		SpringApplication.run(HrmsApplication.class, args);
		
		/*
		 
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
		 
				"cloud_name", "azzavc",
				"api_key", "615438541934276",
				"api_secret", "U43fx5jyBrBbgX5x5XBAdUBY1Rg",
				"secure", true));
		
		File file = new File("kaood1.PNG");
		Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
		
		*/
	}
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.azizavci.HRMS"))                                      
          .build();                                           
    }

}
