package com.openvz.spring_learn.springlearn.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.openvz.spring_learn.springlearn.interceptors.RequestHeaderInterceptor;

@Configuration
public class ProjectSpringConfigurations implements WebMvcConfigurer{
	
	@Override
	public void addInterceptors(InterceptorRegistry registory)
	{
		registory.addInterceptor(new RequestHeaderInterceptor());
	}

}
