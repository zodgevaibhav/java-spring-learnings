package com.openvz.spring_learn.springlearn.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.openvz.spring_learn.springlearn.context.APIContext;


@RestController
public class StudentController {
	
	
	@PostMapping("/student")
	public void validateStudentRequest( HttpServletRequest request, HttpServletResponse response)
	{
		
		try {
			response.getWriter().append("Response"+APIContext.getContextRequst());
		} catch (IOException e) {
			try {
				response.getWriter().append("System Error");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
