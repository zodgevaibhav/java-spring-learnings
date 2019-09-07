package com.openvz.spring_learn.springlearn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.openvz.spring_learn.springlearn.services.StudentServiceImpl;

@org.springframework.web.bind.annotation.RestController
public class CustomRestController {
	
	@Autowired
	Environment env;
	
	@RequestMapping("/health")
	public String checkHealth()
	{
		return "I am breathing";
	}
	
	@RequestMapping("/port")
	public String getPort()
	{
		return env.getProperty("server.port");
	}
	
	@GetMapping("/student/getSampleResponse")
	public StudentServiceImpl  getName()
	{
		return StudentServiceImpl.getSampleResponse();
	}
	
	@RequestMapping("/env")
	public String getEnv()
	{
		return env.getProperty("environment");
	}
	
	@RequestMapping("/student/id")
	public String getStudentId(@RequestParam String id)
	{
		return "Student id sent is  - "+id;
	}

}
