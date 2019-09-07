package com.openvz.spring_learn.springlearn.interceptors;

import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.openvz.spring_learn.springlearn.context.APIContext;
import com.openvz.spring_learn.springlearn.custom_utils.XSDValidator;

public class RequestHeaderInterceptor implements HandlerInterceptor {

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//ServletInputStream requestBody= request.getInputStream();

		Scanner scanner = new Scanner(request.getInputStream(), "UTF-8");
		String strRequest="";
		while(scanner.hasNextLine())
			strRequest=strRequest+scanner.nextLine();
		
		APIContext.setContextRequst(strRequest);
		
		if (request.getContentType().contains("text/xml")) {

			try {
				XSDValidator.validateXMLSchema(strRequest);
			} catch (Exception e) {
				response.getWriter().append("failure " + e.getMessage());
				return false;
			}
		}
		return true;
	}
}
