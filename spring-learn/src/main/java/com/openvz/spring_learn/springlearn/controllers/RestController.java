package com.openvz.spring_learn.springlearn.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
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
	
	@RequestMapping("/name")
	public String getName()
	{
		return env.getProperty("name");
	}
	
	@RequestMapping("/env")
	public String getEnv()
	{
		return env.getProperty("environment");
	}
	
	@RequestMapping("/student")
	public String getStudentId(@RequestParam String id)
	{
		return "Student id sent is  - "+id;
	}

}
