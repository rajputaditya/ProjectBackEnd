package com.ibm.training;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class CalendarRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarRestApiApplication.class, args);
	}
	

	@Bean
	Docket configureSwagger() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.build()
				
				.apiInfo(new ApiInfo("User API Documentation", 
						"API for Event Details", 
						"1.0.0",
						"Free for users to learn",
						new Contact("Ankush Kansal", "www.learnjava.com", "ankushkansal14@gmail.com"),
						"Free",
						"www.somecode.com",
						Collections.emptyList()));
	}

	

}
