package com.tgdd.fresher.webAPI.config;

import javax.xml.ws.WebEndpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.RequestHandledEvent;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

public class SwaggerConfiguration {
	
	public static final String AUTHORIZATION_HEADER = "";
	public static final String DEFAULT_INCLUDE_PATTERN = "";
	
	@Bean
	public Docket productApiDocket() {
		System.out.println("Test:.....");
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
	
	
}
